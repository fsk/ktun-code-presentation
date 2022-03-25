package com.ktun.crudapp.StudentRepository;

import com.ktun.crudapp.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<Student, Integer> {
}
