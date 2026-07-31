package com.StudentsManagementSystem.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudentsManagementSystem.entity.Student;

import com.StudentsManagementSystem.service.StudentService;

public class ServiceImpl implements StudentService{
    @Autowired
    com.StudentsManagementSystem.repository.Studentrepository StudentRepository;

    @Override
    public List<Student> getAllStudents(){

        List<Student> list = StudentRepository.findAll();

        return list;

    }

}
