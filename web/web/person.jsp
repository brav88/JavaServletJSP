<%-- 
    Document   : person
    Created on : 30 sept 2026, 6:33:34 p. m.
    Author     : Personal
--%>

<%@page import="my.webapp.person.Person"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            List<Person> personList = (List<Person>) request.getAttribute("personList");
        %>     
        <a href="person-edit.jsp">Add new</a>                
        <ul>
        <%for(Person person : personList){%>               
            <li><%=person.getName()%> <%=person.getLastName()%> age:<%=person.getAge()%></li>
            <p>Address: <%=person.getAddress()%></p>
            <p>Ph# <%=person.getPhoneNumber() %></p>
            <a href="PersonServlet?action=delete&id=<%=person.getId()%>">Delete</a>
            <hr>
        <% } %>                
        </ul>                        
    </body>
</html>
