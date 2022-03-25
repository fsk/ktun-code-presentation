package com.ktun.crudapp.service;

import com.ktun.crudapp.StudentRepository.StudentRepository;
import com.ktun.crudapp.entity.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;


    public final List<Student> getAllStudents() {
        return studentRepository.findAll();
    }


    public final Student getStudentById(Integer id) {
        return studentRepository.findById(id).orElseThrow(() -> new IllegalArgumentException());
    }

    public final String deleteStudentById(Integer id) {
        studentRepository.deleteById(id);
        return "Student Deleted";
    }

    public final String deleteAllStudents() {
        studentRepository.deleteAll();
        return "All Students Deleted";
    }

    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }
}
