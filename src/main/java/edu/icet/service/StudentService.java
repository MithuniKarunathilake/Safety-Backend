package edu.icet.service;

import edu.icet.dto.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAll();
    void addStudent(Student student);
    void deleteStudentById(Integer id);
    Student searchStudentById(Integer id);
    void updateStudentById(Student student);
}
