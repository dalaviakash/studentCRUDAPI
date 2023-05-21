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

    //add student data
    @PostMapping("/add")
    public void addStudent(@RequestBody Student s){
        services.addStudent(s);
    }

    //get all student data
    @GetMapping("/get")
    public List<Student> getAllStudent(){
        return services.getAllStudent();
    }

    //update student data
    @PutMapping("/updatestudent")
    public void updateStudent(@RequestBody Student s){
        services.updateStudent(s);
    }

    //delete stdent by id
    @DeleteMapping("/delete/{id}")
    public void deleteStudent(@PathVariable(value = "id")int id){
        services.deleteStudent(id);
    }
}
