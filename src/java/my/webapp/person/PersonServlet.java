/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package my.webapp.person;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;
import my.webapp.database.Database;
import java.sql.*;

/**
 *
 * @author Personal
 */
public class PersonServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {        
        try
        {
            Database db = new Database();
            Connection conn = db.getConnection();
            PreparedStatement pstat = conn.prepareStatement("SELECT * FROM Persons;");
        
            ResultSet rs = pstat.executeQuery();
        
            List<Person> personList = new ArrayList<>();
        
            while(rs.next()){
                personList.add(new Person(rs.getInt("Id"), 
                                          rs.getString("Name"), 
                                          rs.getString("LastName"), 
                                          rs.getString("Address"), 
                                          rs.getInt("Age"), 
                                          rs.getString("PhoneNumber")));           
            }
                     
            request.setAttribute("personList", personList);
            request.getRequestDispatcher("person.jsp").forward(request, response);   
        }
        catch (SQLException ex)
        {
            System.getLogger(PersonServlet.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
    }
}
