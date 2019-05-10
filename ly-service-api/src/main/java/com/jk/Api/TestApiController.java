package com.jk.Api;

import com.jk.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;

public interface TestApiController {

    @RequestMapping("/Hi")
    public User Hi();
}
