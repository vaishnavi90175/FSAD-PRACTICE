package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Student;
import com.example.repo.StudentRepo;
import com.example.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepo studentRepo;

    @Override
    public Student saveStudent(Student student) {
        return studentRepo.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepo.findById(id).orElse(null);
    }

    @Override
    public void deleteStudent(Long id) {
        studentRepo.deleteById(id);
    }
}
