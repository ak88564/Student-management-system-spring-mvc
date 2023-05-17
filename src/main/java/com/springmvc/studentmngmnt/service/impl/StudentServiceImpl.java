package com.springmvc.studentmngmnt.service.impl;

import com.springmvc.studentmngmnt.entity.Student;
import com.springmvc.studentmngmnt.repositpory.StudentRepository;
import com.springmvc.studentmngmnt.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        super();
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents(){
        return studentRepository.findAll();

    }
}
