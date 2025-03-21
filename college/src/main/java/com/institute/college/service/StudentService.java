package com.institute.college.service;

import com.institute.college.model.Student;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface StudentService {
    public List<Student> getAllUsers();
    public Student saveUser(Student user);
    public Student getStudent(Long id);
    public ResponseEntity<String> deleteUser(Long id);
    public Student updateStandard(Student student);
}
