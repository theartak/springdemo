package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.*;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {
    private final StudentService studentSVC;

    @Autowired
    public StudentController(StudentService studentSVC) {
        this.studentSVC = studentSVC;
    }

    @GetMapping
    public List<Student> getStudents() {
        return studentSVC.getStudents();
    }

    @PostMapping
    public void registerNewStudent(@RequestBody Student student) {
        studentSVC.addNewStudent(student);
    }

    @DeleteMapping(path = "{studentId}")
    public void deleteStudent(@PathVariable("studentId") Long studentId) {
        studentSVC.deleteStudent(studentId);
    }

    @PutMapping(path = "{studentId}")
    public void updateStudent(@PathVariable("studentId") Long studentId,
                              @RequestParam(required = false) String name,
                              @RequestParam(required = false) String email) {
        studentSVC.updateStudent(studentId, name, email);
    }
}
