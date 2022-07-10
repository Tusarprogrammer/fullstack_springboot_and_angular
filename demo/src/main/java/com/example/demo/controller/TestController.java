package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.EmployeeDTO;
import com.example.demo.entity.User;
import com.example.demo.service.impl.UserServiceImpl;

@RequestMapping("/api")
@RestController
public class TestController {

    @Autowired
    UserServiceImpl userServiceImpl;

    @GetMapping("/data")
    public List<EmployeeDTO> firstApi() {
        List<EmployeeDTO> emps = new ArrayList<EmployeeDTO>();

        EmployeeDTO employeeDTO = new EmployeeDTO("id#1", "name#1", "email#1", "contactNumber#1", "queryDetails#1");
        emps.add(employeeDTO);

        employeeDTO = new EmployeeDTO("id#2", "name#2", "email#2", "contactNumber#2", "queryDetails#2");
        emps.add(employeeDTO);

        employeeDTO = new EmployeeDTO("id#3", "name#3", "email#3", "contactNumber#3", "queryDetails#3");
        emps.add(employeeDTO);

        return emps;
    }

    @GetMapping("/users")
    public @ResponseBody List<User> getAllUsers() {
        List<User> data = userServiceImpl.getAllUsers();
        return data;
    }

    @PostMapping("/add")
    public @ResponseBody User addUser(@RequestBody User user) {
        return userServiceImpl.addUser(user);
    }

}
