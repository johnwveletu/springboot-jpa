package com.example.springboot.controller;

import com.example.springboot.bean.Employee;
import com.example.springboot.repository.EmployeeRepository;
import org.hibernate.criterion.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/emp/{id}")
    public String emp(@PathVariable("id") Integer id){
        Employee employee = employeeRepository.getOne(id);
        //此处不用返回Employee对象，框架在进行json转转的时候会触发lazy赖加载，但是此时session已经关闭，即会报错。
        return employee.toString();
    }

    @GetMapping("/emp")
    public Employee emp(Employee employee){
        employeeRepository.save(employee);
        return employee;
    }

}
