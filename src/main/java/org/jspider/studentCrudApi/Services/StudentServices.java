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

    public void addStudent(Student c){
        repository.save(c);
    }

    public List<Student> getAllStudent(){
        List<Student>studentList=repository.findAll();
        return studentList;
    }

    public void updateStudent(Student c){
        repository.save(c);

    }


    public void deleteStudent(int id){
        repository.deleteById(id);
    }
}
