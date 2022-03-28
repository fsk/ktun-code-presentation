package com.ktun.crudapp.controller;

import com.ktun.crudapp.entity.Student;
import com.ktun.crudapp.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping("/")
    public String merhaba() {
        return "Herkese Merhaba. Turkey Java Community olarak burada olmaktan" +
                "cok mutluyuz.";
    }

    @GetMapping("/bitti")
    public String burayaKadar() {
        return "Benim anlatacaklarim bu kadardi. Beni dinlediginiz icin tesekkurler.";
    }

    @GetMapping("/get-all-students")
    public ResponseEntity<List<Student>> getAllStudents() {
        return ResponseEntity.status(200).body(studentService.getAllStudents());
    }

    @GetMapping("/student/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable(value = "id") Integer id) {
        return ResponseEntity.status(200).body(studentService.getStudentById(id));
    }

    @PostMapping("/student")
    public ResponseEntity<String> createStudent(@RequestBody Student student) {
        studentService.createStudent(student);
        return ResponseEntity.status(201).body("Student saved.");
    }

    @DeleteMapping("/delete-student/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable Integer id) {
        studentService.deleteStudentById(id);
        return ResponseEntity.status(205).body("Student saved.");
    }

    @DeleteMapping("/delete-all-students")
    public ResponseEntity deleteAllStudents() {
        return ResponseEntity.ok(studentService.deleteAllStudents());
    }

    @PutMapping("/update-student/{id}")
    public ResponseEntity<Student> updateEmployeeById(@PathVariable(value = "id") Integer id, @RequestBody Student updatedStudent) {
        return ResponseEntity.ok(studentService.updateStudent(id, updatedStudent));
    }


}
