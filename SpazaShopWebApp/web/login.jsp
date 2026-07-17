<%-- 
    Document   : login
    Created on : 04 Jul 2024, 4:31:14 AM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <h1>Login</h1>
        <form action="j_security_check" method="POST">
            <table>
               
                <tbody>
                    <tr>
                        <td>Username</td>
                        <td><input type="text" name="j_username"/></td>
                    </tr>
                    <tr>
                        <td>Password</td>
                        <td><input type="password" name="j_password"/></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><input type="submit" value="SUBMIT"/></td>
                    </tr>
                </tbody>
            </table>

        </form>
    </body>
</html>
