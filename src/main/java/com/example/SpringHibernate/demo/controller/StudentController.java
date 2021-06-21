package com.example.SpringHibernate.demo.controller;

import com.example.SpringHibernate.demo.model.Student;
import com.example.SpringHibernate.demo.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/raffle")
    public ResponseEntity<List<Student>> getTenStudents() {
        return new ResponseEntity<>(studentService.getStudents(),HttpStatus.OK);
    }

    @PostMapping("/addStudent")
    public void addStudent(@RequestBody Student student) {
        studentService.addStudent(student);
    }
}
