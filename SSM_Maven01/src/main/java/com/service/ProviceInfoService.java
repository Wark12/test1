package com.service;

import com.dao.ProviceInfoDao;
import com.entity.Provice;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import redis.clients.jedis.JedisPool;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class ProviceInfoService {
    @Resource
    private ProviceInfoDao proviceInfoDao;
    @Resource
    private JedisPool jedisPool;

    public String findAll() {
        //去到redis查找有没有数据
        //如果没有去数据库查，然后在放在redis
        //如果有直接去redis取数据
        String json=jedisPool.getResource().get("provice");
        if (json==null) {
            List<Provice> plist=proviceInfoDao.findAll();
            ObjectMapper om=new ObjectMapper();
            try {
                json=om.writeValueAsString(plist);
                jedisPool.getResource().set("provice", json);
            } catch (JsonProcessingException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }else {
            System.out.println("现在使用redis缓存");
        }
        return json;

    }
}

