package com.jk.controller;

import com.jk.Api.TestApiController;
import com.jk.pojo.User;
import com.jk.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController implements TestApiController{

    @Autowired
    private TestService testService;

    @Override
    public User Hi() {

        return testService.Hi();
    }
}
