package com.example.studentdal;

import com.example.studentdal.entities.Student;
import com.example.studentdal.repos.StudentRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.Table;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest


public class StudentdalApplicationTests {

    @Autowired
    StudentRepository studentRepository;

    @Test
    public void testCreateStudent(){
        Student student = new Student();
        student.setName("Ilona");
        student.setCourse("Java");
        student.setFee(30d);

        studentRepository.save(student);

    }


    @Test
    public void testFindStudentById(){
        Optional<Student> studentOptional= studentRepository.findById(1l);
        if (studentOptional.isPresent()){
            Student student = studentOptional.get();
            System.out.println(student);
        }
        else {
            System.out.println("Keinen Student mit dieser ID gefunden.");
        }
    }

    @Test
    public void updateStudent() {
        Optional<Student> studentOptional = studentRepository.findById(1l);
        if (studentOptional.isPresent()) {
            Student student = studentOptional.get();
            student.setName("Céline");
            studentRepository.save(student);
        }
    }

    @Test
    public void deleteStudent() {
        Optional<Student> studentOptional = studentRepository.findById(1l);
        if (studentOptional.isPresent()) {
            Student student = studentOptional.get();
            studentRepository.delete(student);
        }
    }
}
