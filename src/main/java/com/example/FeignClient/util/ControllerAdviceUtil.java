package com.example.FeignClient.util;

import com.example.FeignClient.dto.ControllerPostEmployeeBody;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(value = "controllerAdviceFeignClient",url = "http://localhost:1/employee")
public interface ControllerAdviceUtil {

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id);

    @GetMapping("/all")
    public ResponseEntity<List<?>> getAllEmployees();

    @PostMapping("")
    public ResponseEntity<ControllerPostEmployeeBody> saveEmployee
            (@RequestBody ControllerPostEmployeeBody controllerPostEmployeeBody);
}
