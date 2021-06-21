package com.example.SpringHibernate.demo.service;

import com.example.SpringHibernate.demo.model.Student;
import com.example.SpringHibernate.demo.repository.StudentRepository;
import org.springframework.stereotype.Service;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

@Service
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getStudents() {
        Random random = new Random();
        List<Student> studentList = studentRepository.findAll();
        List<Student> selectedStudents = new LinkedList<>();

        for(int i = 0; i < studentList.size()/2; i++) {
            int randomIndex = random.nextInt(studentList.size());
            selectedStudents.add(studentList.remove(randomIndex));
        }

        return selectedStudents;
    }

    @Override
    public void addStudent(Student student) {
        studentRepository.save(student);
    }
}
