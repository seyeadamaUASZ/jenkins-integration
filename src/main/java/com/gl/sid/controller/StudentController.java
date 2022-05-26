package com.gl.sid.controller;

import com.gl.sid.entities.Student;
import com.gl.sid.repositories.StudentRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
@CrossOrigin(origins = "*")
public class StudentController {
    private StudentRepository repos;

    public StudentController(StudentRepository repos) {
        this.repos = repos;
    }

    @GetMapping
    public List<Student> listStudent(){
        List<Student> students = this.repos.findAll();
        return students;
    }

    @PostMapping
    public Student addStudent(@RequestBody Student student){
        return this.repos.save(student);
    }

    @GetMapping("/{id}")
    public Optional<Student> getStudentById(@PathVariable("id") Long id){
        return this.repos.findById(id);
    }



    @DeleteMapping("/delete/{id}")
    public void deleteStudent(@PathVariable("id") Long id){
        this.repos.deleteById(id);
    }
}

