package com.project.employee.controller;


import com.project.employee.service.StudentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/student")
@RequiredArgsConstructor
@Slf4j


public class StudentController {
    public final StudentService studentService;


    @GetMapping("/name")
    public String studentName(){
        return studentService.name();
    }


    @GetMapping("/age")
    public int age(){
        return studentService.age();

    }

    @GetMapping("/hire")
    public boolean hired(){
        return studentService.hired();
    }



}
