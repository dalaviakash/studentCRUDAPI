package org.jspider.studentCrudApi.Services;

import org.jspider.studentCrudApi.Model.Student;
import org.jspider.studentCrudApi.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServices {
    @Autowired
    private StudentRepository repository;
    //add student data
    public void addStudent(Student c){
        repository.save(c);
    }

    //get all student data
    public List<Student> getAllStudent(){
        List<Student>studentList=repository.findAll();
        return studentList;
    }

    //update student data
    public void updateStudent(Student c){
        repository.save(c);

    }

   //delete data by id
    public void deleteStudent(int id){
        repository.deleteById(id);
    }
}
