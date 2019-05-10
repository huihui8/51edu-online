package com.jk.controller;

import com.jk.pojo.User;
import com.jk.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aa")
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("/Hi")
    public User Hi(){
     User dx=   testService.Hi();
        return  dx;
    }

}
