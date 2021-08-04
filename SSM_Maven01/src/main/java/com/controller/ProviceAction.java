package com.controller;

import com.service.ProviceInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class ProviceAction {
    @Resource
    private com.service.ProviceInfoService ProviceInfoService;
    @RequestMapping(value = "find.do",produces = "text/json;charset=utf-8")
    @ResponseBody
    public String findProvice() {
        String json=ProviceInfoService.findAll();
        return json;

    }
}
