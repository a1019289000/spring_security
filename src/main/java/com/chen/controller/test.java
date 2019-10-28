package com.chen.controller;

import com.chen.dao.Stu;
import com.chen.dao.stu_imp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class test {
    @Autowired
    stu_imp stu;

    @RequestMapping("/index")
    @ResponseBody
    public List<Stu> index() {
        return stu.get();
    }

    @RequestMapping("xxx")
    public String xx() {
        return "xxx";
    }
    @RequestMapping(value = "login",method = RequestMethod.GET)
    public String login(){
        return "login";
    }
}
