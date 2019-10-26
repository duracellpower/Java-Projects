package com.example.studentdal.service;

import com.example.studentdal.entities.Student;
import com.example.studentdal.repos.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student updateLocation(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudent(Student student) {
        studentRepository.delete(student);
    }

    @Override
    public Student getStudent(Long id) {
        return studentRepository.findById(id).get()
;    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
