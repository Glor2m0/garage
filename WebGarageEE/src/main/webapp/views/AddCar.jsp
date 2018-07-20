<%--
  Created by IntelliJ IDEA.
  User: SuperUser
  Date: 18.07.2018
  Time: 23:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>New Car</title>
</head>
    <body>
    <form action="${pageContext.servletContext.contextPath}/clients/add" method="POST">
        <input type="hidden" name="id" value="${client.id}">
        <table>
            <tr>
                <td align="right" >Car : </td>
                <td>
                    <input type="text" name="car">
                </td>
            </tr>
            <tr>
                <td align="right" >Id car : </td>
                <td>
                    <input type="text" name="idCar">
                </td>
            </tr>
            <tr>
                <td><input type="submit" align="center" value="Submit"/></td>
            </tr>
        </table>
    </form>
    </body>
</html>
