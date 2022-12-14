/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package schoolmanagement.persistence.dao.impl;

import java.io.IOException;
import java.util.List;
import schoolmanagement.commonlib.model.Student;
import schoolmanagement.persistence.dao.StudentDao;
import java.sql.*;
import java.time.LocalDateTime;

/**
 *
 * @author ivano
 */
public class StudentDaoImpl implements StudentDao {
    
    private Connection connection;

    @Override
    public Student saveStudent(Student student) throws SQLException, IOException {
        final String sqlQuery = "INSERT INTO Student(user_id,first_name,last_name,birthdate,creation_date) VALUES(?,?,?,?,?)";
        try ( PreparedStatement statement = connection.prepareStatement(sqlQuery)) {

            statement.setLong(1, student.getId());
            statement.setString(2, student.getFirstName());
            statement.setString(3, student.getLastName());
            statement.setDate(4, Date.valueOf(student.getBirthdate()));
            statement.setTimestamp(5, Timestamp.valueOf(LocalDateTime.now()));

            statement.executeUpdate();
            
            return student;
        }

    }

    @Override
    public void updateStudent() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Student> getAllStudents() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Student getStudentById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    @Override
    public void setConnection(Connection connection) {
        this.connection = connection;
    }

}
