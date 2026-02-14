package com.project.employee.service;

import org.springframework.stereotype.Service;

@Service

public class StudentService {
    public String name(){
        return "nishant";
    }

    public int age(){
        return 24;
    }

    public boolean hired(){
        return true;
    }

    public String nickname(){
       return  "shroff";
    }
}
