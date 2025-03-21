package com.institute.college.controller;

import com.institute.college.model.Test;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main")
public class Controller {
    @GetMapping("/get")
    public Test getTest(){
        Test test1=new Test();
       // test1.setTest("cbcgnbg");
        return test1;
    }
    @RequestMapping(value = "/greet", method = RequestMethod.GET)
    public String greet() {
        return "Hello, welcome to the API!";
    }
}
