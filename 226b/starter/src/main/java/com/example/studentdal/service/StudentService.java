package com.example.studentdal.service;

import com.example.studentdal.entities.Student;
import java.util.List;

public interface StudentService {

    Student saveStudent(Student student);
    Student updateLocation(Student student);
    void deleteStudent(Student student);
    Student getStudent(Long id);
    List<Student> getAllStudents();
}
