package com.ktun.crudapp.StudentRepository;

import com.ktun.crudapp.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.stream.Stream;


public interface StudentRepository extends JpaRepository<Student, Integer> {

    //Stream<Student> existsByEmail();


}
