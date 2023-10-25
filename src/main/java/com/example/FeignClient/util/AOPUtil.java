package com.example.FeignClient.util;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "aopFeignClient",url = "http://localhost:2/employee")
public interface AOPUtil {

    @GetMapping("")
    public ResponseEntity<?> findAllEmployee();
}
