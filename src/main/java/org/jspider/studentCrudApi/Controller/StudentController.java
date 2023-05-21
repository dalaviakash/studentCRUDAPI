package org.jspider.studentCrudApi.Controller;

import org.jspider.studentCrudApi.Model.Student;
import org.jspider.studentCrudApi.Services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentServices services;

    @PostMapping("/add")
    public void addStudent(@RequestBody Student s){
        services.addStudent(s);
    }
    @GetMapping("/get")
    public List<Student> getAllStudent(){
        return services.getAllStudent();
    }

    @PutMapping("/updatestudent")
    public void updateStudent(@RequestBody Student s){
        services.updateStudent(s);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteStudent(@PathVariable(value = "id")int id){
        services.deleteStudent(id);
    }
}
