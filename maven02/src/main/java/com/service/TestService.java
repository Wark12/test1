package com.service;

import com.dao.TestDao;
import com.entity.StudentInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

import java.util.List;

@Service
@Transactional
public class TestService {
    @Resource
    private TestDao testDao;

    public TestDao getTestDao() {
        return testDao;
    }

    public void setTestDao(TestDao testDao) {
        this.testDao = testDao;
    }
    public  List<StudentInfo> queryAll() {
       return testDao.queryAll();
    }

}
