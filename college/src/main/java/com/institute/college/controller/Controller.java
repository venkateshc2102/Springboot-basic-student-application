package com.institute.college.controller;

import com.institute.college.model.Student;
import com.institute.college.model.Test;
import com.institute.college.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/college")
public class Controller {
    @Autowired
    StudentService studentService;

    @RequestMapping(value = "/greet", method = RequestMethod.GET)
    public String greet() {
        return "Hello, welcome to the API!";
    }

    @GetMapping
    public List<Student> getAllUsers() {
        return studentService.getAllUsers();
    }

    @PostMapping("addStudent")
    public Student addStudent(@RequestBody Student user) {
        return studentService.saveUser(user);
    }

    @PutMapping()
    public Student updateStandard(@RequestBody Student updatedStudent) {
        return studentService.updateStandard(updatedStudent);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id){ return studentService.deleteUser(id);}
}
