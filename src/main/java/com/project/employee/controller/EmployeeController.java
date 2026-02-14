package com.project.employee.controller;

import com.project.employee.model.Employee;
import com.project.employee.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/employees")
@RequiredArgsConstructor
@Slf4j
public class EmployeeController {
    private final EmployeeService employeeService;

    @GetMapping("/getemp")
    public ResponseEntity<String> getEmployees() {
        String a = "Nikhil";
        return ResponseEntity.ok(a);
    }

    @GetMapping("/getthis")
    public int getNumber() {
        return employeeService.getValue();
    }

    @GetMapping("/name")
    public Employee Name(){
        return employeeService.getName();
    }

    @GetMapping("/join")
    public boolean joined(){

        return employeeService.isJoined();
    }

    public String empName(){
        return employeeService.Name();
    }
}
