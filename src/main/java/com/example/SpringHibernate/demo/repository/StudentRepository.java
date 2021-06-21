package com.example.SpringHibernate.demo.repository;

import com.example.SpringHibernate.demo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
