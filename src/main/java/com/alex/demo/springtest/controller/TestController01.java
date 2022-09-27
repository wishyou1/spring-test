package com.alex.demo.springtest.controller;

import com.alex.demo.springtest.bean.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test01")
public class TestController01 {
    @RequestMapping(value = "/showAll", method = RequestMethod.GET)
    @ResponseBody
    public Student showAll(){
        Student s = new Student();
        s.setName("liu");
        return s;
    }
}
