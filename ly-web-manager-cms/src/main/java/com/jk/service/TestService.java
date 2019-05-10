package com.jk.service;

import com.jk.Api.TestApiController;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "ly-service-manage-cms")
public interface TestService extends TestApiController{
}
