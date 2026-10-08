/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.webapp.person;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import my.webapp.database.Database;

/**
 *
 * @author Personal
 */
public class PersonDAO {

    public List<Person> getAll() {
        try {
            Database db = new Database();
            Connection conn = db.getConnection();
            PreparedStatement pstat = conn.prepareStatement("SELECT * FROM Persons;");

            ResultSet rs = pstat.executeQuery();

            List<Person> personList = new ArrayList<>();

            while (rs.next()) {
                personList.add(new Person(rs.getInt("Id"),
                        rs.getString("Name"),
                        rs.getString("LastName"),
                        rs.getString("Address"),
                        rs.getInt("Age"),
                        rs.getString("PhoneNumber")));
            }

            return personList;

        } catch (SQLException ex) {
            return null;
        }
    }
    
    public void insert(Person person) {
        try {
            Database db = new Database();
            Connection conn = db.getConnection();
            PreparedStatement pstat = conn.prepareStatement("INSERT INTO Persons (Name, LastName, Address, Age, PhoneNumber) VALUES (?, ?, ?, ?, ?);");
            
            pstat.setString(1, person.getName());
            pstat.setString(2, person.getLastName());
            pstat.setString(3, person.getAddress());
            pstat.setInt(4, person.getAge());
            pstat.setString(5, person.getPhoneNumber());
            
            pstat.executeUpdate();
        } catch (SQLException ex) {
             System.getLogger(PersonDAO.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }
    
    public void delete(int Id) {
        try {
            Database db = new Database();
            Connection conn = db.getConnection();
            PreparedStatement pstat = conn.prepareStatement("DELETE FROM Persons WHERE Id = ?");
            
            pstat.setInt(1, Id);           
            
            pstat.executeUpdate();
        } catch (SQLException ex) {
             System.getLogger(PersonDAO.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }
}
