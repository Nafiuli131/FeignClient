package com.example.FeignClient.controller;

import com.example.FeignClient.dto.ControllerPostEmployeeBody;
import com.example.FeignClient.util.ControllerAdviceUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/adviceController")
public class AdviceController {
    @Autowired
    ControllerAdviceUtil controllerAdviceUtil;

    @GetMapping("/{id}")
    public ResponseEntity<?> getEmployeeById(@PathVariable Long id) {
        return controllerAdviceUtil.findById(id);
    }

    @GetMapping("")
    public ResponseEntity<?> getAllEmployee() {
        return controllerAdviceUtil.getAllEmployees();
    }

    @PostMapping("")
    public ResponseEntity<ControllerPostEmployeeBody> saveEmployee
            (@RequestBody ControllerPostEmployeeBody controllerPostEmployeeBody) {
        System.out.println("Post employee api");
        return controllerAdviceUtil.saveEmployee(controllerPostEmployeeBody);
    }
}
