package com.institute.college.service;

import com.institute.college.model.Student;
import com.institute.college.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public Student getStudent(Long id){
        return studentRepository.findById(id).get();
    }

    public Student updateStandard(Student student){
        Student data= studentRepository.findByEmail(student.getEmail());
        if(data!=null){
            data.setStandard(student.getStandard());
        }
        return studentRepository.save(data);
    }

    public ResponseEntity<String> deleteUser(Long id){
        boolean validateByEmail=studentRepository.existsById(id);
        if(validateByEmail){
            studentRepository.deleteById(id);
            return new ResponseEntity<>("Student deleted successfully!", HttpStatus.OK);
        }
        return new ResponseEntity<>("Student not found!", HttpStatus.NOT_FOUND);
        }
}
