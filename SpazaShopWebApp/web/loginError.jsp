<%-- 
    Document   : loginError
    Created on : 04 Jul 2024, 4:36:03 AM
    Author     : User
--%>

<%@page isErrorPage="true" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>login Error Page</title>
    </head>
    <body>
        <h1>Login Error </h1>
        <p>
            Invalid login details. please login again
        </p>
        <form action="j_security_check" method="POST">
             <table>
                <tr>
                    <td>Username:</td>
                    <td><input type="text" name="j_username" required=""/></td>
                </tr>
                <tr>
                    <td>Password:</td>
                    <td><input type="password" name="j_password" required=""/></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="SUBMIT"/></td>
                </tr>
            </table>
        </form>
        
    </body>
</html>
