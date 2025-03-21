package com.institute.college.service;

import com.institute.college.model.Student;
import com.institute.college.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    StudentRepository studentRepository;

    public List<Student> getAllUsers() {
        return studentRepository.findAll();
    }
    public Student saveUser(Student user) {
        return studentRepository.save(user);
    }
}
