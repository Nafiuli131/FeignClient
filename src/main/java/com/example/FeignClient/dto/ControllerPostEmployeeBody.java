package com.example.FeignClient.dto;

public class ControllerPostEmployeeBody {
    private Long employeeId;
    private String name;
    private String email;

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ControllerPostEmployeeBody() {
    }

    public ControllerPostEmployeeBody(Long employeeId, String name, String email) {
        this.employeeId = employeeId;
        this.name = name;
        this.email = email;
    }
}
