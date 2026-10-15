<%-- 
    Document   : person
    Created on : 30 sept 2026, 6:33:34 p. m.
    Author     : Personal
--%>

<%@page import="my.webapp.login.User"%>
<%@page import="my.webapp.person.Person"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@6.0.0-alpha.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-B/GM4XqrwHnWXNOWMbloTmrYXZg10cakYGmpfsR/bbzQ6JAJI4ihuyADKLnBgrCe" crossorigin="anonymous">
        <script type="module" src="https://cdn.jsdelivr.net/npm/bootstrap@6.0.0-alpha.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-1a/pXj49ZQ1aHEmrJ+gMw1otqoVsYwlEnlD8mIfY2TV03r20Y0CN7uqx1tQogjPL" crossorigin="anonymous"></script>
    </head>
    <body>
        <%
            User user = (User)session.getAttribute("User");
            List<Person> personList = (List<Person>) request.getAttribute("personList");
        %>     

        <nav class="navbar md:navbar-expand bg-1">
            <div class="container-fluid">
                <a class="navbar-brand" href="#">WebApp</a>
                <button class="btn-icon navbar-toggler" type="button" data-bs-toggle="drawer" data-bs-target="#navbarDrawer" aria-controls="navbarDrawer" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon" aria-hidden="true"></span>
                </button>
                <dialog class="drawer drawer-end" tabindex="-1" id="navbarDrawer" aria-labelledby="navbarDrawerLabel">
                    <div class="drawer-header">
                        <h5 class="drawer-title" id="navbarDrawerLabel">Menu</h5>
                        <button type="button" class="btn-close" data-bs-dismiss="drawer" aria-label="Close"></button>
                    </div>
                    <div class="drawer-body mb-2 md:mb-0">
                        <ul class="nav navbar-nav me-auto">
                            <li class="nav-item">
                                <a class="nav-link active" aria-current="page" href="#">Home</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="#">Link</a>
                            </li>
                            <li class="nav-item">
                                <button class="nav-link" type="button" data-bs-toggle="menu" aria-expanded="false">
                                    Persons
                                </button>
                                <div class="menu">
                                    <a class="menu-item" href="PersonServlet">View all persons</a>
                                    <a class="menu-item" href="person-edit.jsp">Add new person</a>
                                    <hr class="menu-divider">
                                    <a class="menu-item" href="#">Something else here</a>
                                </div>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link disabled" aria-disabled="true">Disabled</a>
                            </li>
                        </ul>                      
                    </div>
                </dialog>
            </div>
        </nav>
        <br>
        <div class="container">            
            <p>Welcome <%=user.getAlias()%></p>
            <div class="card">                
                <div class="card-body">
                    <table class="table table-hover">
                        <thead>
                            <tr>
                                <th scope="col">#</th>
                                <th scope="col">Name</th>
                                <th scope="col">Last Name</th>
                                <th scope="col">Age</th>
                                <th scope="col">Phone</th>
                                <th scope="col">Address</th>
                                <th scope="col">Action</th>
                            </tr>
                        </thead>    
                        <tbody>
                            <%for (Person person : personList) {%>  
                            <tr>
                                <th scope="row"><%=person.getId()%></th>
                                <td><%=person.getName()%></td>
                                <td><%=person.getLastName()%></td>
                                <td><%=person.getAge()%></td>
                                <td><%=person.getPhoneNumber()%></td>
                                <td><%=person.getAddress()%></td>
                                <td><a href="PersonServlet?action=delete&id=<%=person.getId()%>">Delete</a></td>
                            </tr>
                            <% }%>  
                        </tbody>
                    </table>     
                </div>
            </div>
        </div>
    </body>
</html>
