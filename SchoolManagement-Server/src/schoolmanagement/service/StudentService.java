/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package schoolmanagement.service;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;
import schoolmanagement.commonlib.model.Student;
import validation.exception.ValidationException;
import java.sql.SQLException;
import schoolmanagement.validator.student.StudentValidator;

/**
 *
 * @author ivano
 */
public interface StudentService {
    
    Student save(Student student,StudentValidator validator) throws ValidationException,IOException,SQLException;
    void update();
    Student getById();
    List<Student> getAll();
}
