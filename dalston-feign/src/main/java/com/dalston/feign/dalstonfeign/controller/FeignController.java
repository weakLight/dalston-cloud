package com.dalston.feign.dalstonfeign.controller;

import com.dalston.feign.dalstonfeign.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class FeignController {
    @Resource
    FeignService feignService;

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String syaHi(String name) {
        return feignService.sayHiFromClientOne(name);
    }
}
