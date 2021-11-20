package com.csa.samplefullstack.controller;

import com.csa.samplefullstack.entity.Employee;
import com.csa.samplefullstack.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin("*")
public class EmployeeController {
    
    @Autowired  // spring - dependency injection
    private EmployeeRepository employeeRepository;
    
    @RequestMapping("/employees")
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }
}

