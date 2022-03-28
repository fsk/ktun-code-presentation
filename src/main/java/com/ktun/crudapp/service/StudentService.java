package com.ktun.crudapp.service;

import com.ktun.crudapp.StudentRepository.StudentRepository;
import com.ktun.crudapp.entity.Student;
import com.ktun.crudapp.exception.studentexceptions.EmailAlreadyExistException;
import com.ktun.crudapp.exception.studentexceptions.StudentNotFoundException;
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
        return studentRepository.findById(id).orElseThrow(() -> new StudentNotFoundException());
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

    public Student updateStudent(Integer studentId, Student updatedStudent) {
        Student student = studentRepository.findById(studentId).orElseThrow(() -> new StudentNotFoundException());
        student.setName(updatedStudent.getName());
        student.setSurname(updatedStudent.getSurname());
        student.setEmail(updatedStudent.getEmail());
        student.setDepartment(updatedStudent.getDepartment());
        student.setAddress(updatedStudent.getAddress());

        return studentRepository.save(student);
    }
}
