package com.dalston.feign.dalstonfeign.service;

import org.springframework.stereotype.Component;

@Component
public class FeignServiceHystric implements FeignService {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry" + name;
    }
}
