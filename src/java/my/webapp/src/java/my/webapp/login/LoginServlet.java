/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package my.webapp.login;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 *
 * @author Personal
 */
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {                
        HttpSession session = request.getSession(false);        
        session.invalidate();
        response.sendRedirect("login.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        UserDAO dao = new UserDAO();
        User user = dao.ValidateLogin(request.getParameter("txtemail"),
                                      request.getParameter("txtpwd"));                

        HttpSession session = request.getSession(false);
        if(session != null){
            session.invalidate();
        }
                
        if (user != null) {  
            session = request.getSession();
            session.setAttribute("User", user);
            response.sendRedirect("PersonServlet");
        }
        else{
            response.sendRedirect("login.jsp?error=User not found");
        }
    }
}
