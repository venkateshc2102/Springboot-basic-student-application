package com.institute.college.repository;

import com.institute.college.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    boolean existsByEmail(String studentEmail);

    boolean deleteByEmail(String studentEmail);

    Student findByEmail(String email);
}
