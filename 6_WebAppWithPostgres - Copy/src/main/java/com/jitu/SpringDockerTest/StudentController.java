package com.jitu.SpringDockerTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentRepo studentRepo;

    @GetMapping("/getstudents")
    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    @GetMapping("/addstudent")
    public void  addStudent() {
        Student student=new Student();
        student.setName("xxxx");
        student.setRollno(1111);
        studentRepo.save(student);
    }
}
