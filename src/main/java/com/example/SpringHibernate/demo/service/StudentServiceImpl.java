package com.example.SpringHibernate.demo.service;

import com.example.SpringHibernate.demo.model.Student;
import com.example.SpringHibernate.demo.repository.StudentRepository;
import org.springframework.stereotype.Service;
import java.util.LinkedList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAlunos() {
        List<Student>  studentList = new LinkedList<>();



        return studentRepository.findAll();
    }
}
