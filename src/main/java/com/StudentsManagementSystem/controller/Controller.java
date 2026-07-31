package com.StudentsManagementSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.StudentsManagementSystem.entity.Student;
import com.StudentsManagementSystem.service.StudentService;
import org.springframework.web.bind.annotation.RequestParam;


@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    private StudentService service;

    @GetMapping("/home")
    public String home(){

        return "home"; // Vista page html archivo -> home.html
    }

    @GetMapping("/students")
    public String getMethodName(@RequestParam String param) {
        return new String();
    }
    
    public String getAllStudents(Model model){

        model.addAttribute("students", service.getAllStudents());

        return "students";

    }

}
