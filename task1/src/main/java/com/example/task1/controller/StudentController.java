package com.example.task1.controller;

import com.example.task1.entity.Student;
import com.example.task1.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService productService) {
        this.studentService = productService;
    }

    @GetMapping("/")
    public String findAllStudents(Model model) {
        List<Student> allStudents = studentService.findAllStudents();
        model.addAttribute("allStudents", allStudents);
        return "all_students";
    }

    @GetMapping("/newStudent")
    public String newProduct(Model model) {
        Student student = new Student();
        model.addAttribute("newStudent", student);
        return "add_student";
    }

    @PatchMapping ("/{id}")
    public String newProduct(@PathVariable Long id, Model model) {
        Student byId = studentService.findById(id);
        model.addAttribute("newStudent", byId);
        return "add_student";
    }

    @PostMapping("/")
    public String addNewProduct(Student student) {
        studentService.save(student);
        return "redirect:/students/";
    }

    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable Long id) {
        studentService.deleteStudent(id);
        return "redirect:/students/";
    }
}
