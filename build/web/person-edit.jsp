<%-- 
    Document   : person-edit
    Created on : 7 oct 2026, 6:27:33 p. m.
    Author     : Personal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form method="POST" action="PersonServlet">
            Name:<input type="text" name="txtname" /> <br>
            LastName:<input type="text" name="txtlastname" /><br>
            Address:<textarea name="txtaddress" cols="32" rows="8"></textarea><br>
            Age:<input type="number" name="txtage" /><br>
            Phone:<input type="text" name="txtphone" /><br>
            <button type="submit">Save</button>
        </form>
    </body>
</html>
