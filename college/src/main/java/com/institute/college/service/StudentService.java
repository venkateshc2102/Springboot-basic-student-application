package com.institute.college.service;

import com.institute.college.model.Student;

import java.util.List;

public interface StudentService {
    public List<Student> getAllUsers();
    public Student saveUser(Student user);
}
