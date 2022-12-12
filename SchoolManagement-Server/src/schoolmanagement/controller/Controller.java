/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package schoolmanagement.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import schoolmanagement.commonlib.model.Student;
import schoolmanagement.service.StudentService;
import schoolmanagement.service.provider.ServiceProvider;
import validation.exception.ValidationException;

/**
 *
 * @author ivano
 */
public class Controller {

    public void createStudent(Student student) {
        
        try {
            //TODO: check unique constraint on username, return Response object!
            
            StudentService studentService = (StudentService) ServiceProvider.getInstance().getRequiredService(StudentService.class);
            
            student = studentService.save(student);
            
            System.out.println(student);
        } catch (ValidationException | IOException | SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
}
