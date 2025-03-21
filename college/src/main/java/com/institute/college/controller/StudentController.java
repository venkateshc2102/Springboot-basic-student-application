package com.institute.college.controller;
import com.institute.college.model.Student;
import com.institute.college.model.Test;
import com.institute.college.service.StudentService;
import com.institute.college.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService studentService;
    @GetMapping
    public List<Student> getAllUsers() {
        return studentService.getAllUsers();
    }

    @PostMapping("addStudent")
    public Student createUser(@RequestBody Student user) {
        return studentService.saveUser(user);
    }
}
