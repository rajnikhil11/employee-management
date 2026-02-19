package com.project.employee.service;

import com.project.employee.model.Employee;
import com.project.employee.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public int getValue() {

        return 10;
    }

    public Employee getName(){
        return employeeRepository.findById(Long.valueOf(1));
    }

    public boolean isJoined(){
        return true;
    }

    public String Name(){
        return "Nikhil ";
    }

    public long Sallary(){
        return 50000;
    }
    public boolean salaried(){
        return true;
    }
}
