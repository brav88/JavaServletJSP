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

/**
 *
 * @author Personal
 */
public class PersonServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        PersonDAO dao = new PersonDAO();
        String action = request.getParameter("action");

        if (action == null) {            
            request.setAttribute("personList", dao.getAll());
            request.getRequestDispatcher("person.jsp").forward(request, response);
        }
        if (action.equals("delete")) {
            int id = Integer.parseInt(request.getParameter("id"));
            dao.delete(id);
            response.sendRedirect("PersonServlet");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PersonDAO dao = new PersonDAO();      
        dao.insert(new Person(0, 
                              request.getParameter("txtname"), 
                              request.getParameter("txtlastname"), 
                              request.getParameter("txtaddress"), 
                              Integer.parseInt(request.getParameter("txtage")), 
                              request.getParameter("txtphone")));

        response.sendRedirect("PersonServlet");
    }
}
