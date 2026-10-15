<%-- 
    Document   : login.jsp
    Created on : 14 oct 2026, 7:21:31 p. m.
    Author     : Personal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@6.0.0-alpha.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-B/GM4XqrwHnWXNOWMbloTmrYXZg10cakYGmpfsR/bbzQ6JAJI4ihuyADKLnBgrCe" crossorigin="anonymous">
        <script type="module" src="https://cdn.jsdelivr.net/npm/bootstrap@6.0.0-alpha.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-1a/pXj49ZQ1aHEmrJ+gMw1otqoVsYwlEnlD8mIfY2TV03r20Y0CN7uqx1tQogjPL" crossorigin="anonymous"></script>
    </head>
    <body>
        <%
            String error = request.getParameter("error");
        %>    
        <br>
        <div class="container d-flex justify-content-center">            
            <div class="card" style="width: 20rem">                
                <div class="card-body">
                    <form method="POST" action="LoginServlet">
                        <div class="form-floating mb-3">
                            <label for="txtemail">Email</label>
                            <input name="txtemail" type="email" class="form-control" id="txtemail" placeholder="email@domain.com">
                        </div>
                        <div class="form-floating mb-3">
                            <label for="txtpwd">Password</label>
                            <input name="txtpwd" type="password" class="form-control" id="txtpwd" placeholder="Doe">
                        </div>                                                                                  
                        <button class="btn-solid theme-primary" type="submit">Login</button>
                    </form>
                    <%
                        if (error != null) {
                    %>  
                    <p><%=error%></p>
                    <%
                        }
                    %>  
                </div>
            </div>
        </div>
    </body>
</html>
