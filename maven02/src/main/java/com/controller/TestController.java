package com.controller;

import com.entity.StudentInfo;
import com.service.TestService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class TestController {
    @Resource
    private TestService testService;

    public TestService getTestService() {
        return testService;
    }

    public void setTestService(TestService testService) {
        this.testService = testService;
    }
    @RequestMapping(value = "queryAll")
    public String queryAll(Model m){
        System.out.println("------");
        List<StudentInfo> stulist=testService.queryAll();
        m.addAttribute("stuliist",stulist);
        return "showAll";
    }
}
