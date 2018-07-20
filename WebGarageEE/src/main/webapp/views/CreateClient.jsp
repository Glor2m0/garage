<%--
  Created by IntelliJ IDEA.
  User: SuperUser
  Date: 18.07.2018
  Time: 20:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" pageEncoding="UTF-8" session="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Create new Client</title>
</head>
    <body>
    <form action="${pageContext.servletContext.contextPath}/clients/create" method="POST">
        <table>
            <tr>
                <td align="right" >Name : </td>
                <td>
                    <input type="text" name="name">
                </td>
            </tr>
            <tr>
                <td align="right" >Car : </td>
                <td>
                    <input type="text" name="car">
                </td>
            </tr>

                <td><input type="submit" align="center" value="Submit"/></td>
            </tr>
        </table>
    </form>

    </body>
</html>
