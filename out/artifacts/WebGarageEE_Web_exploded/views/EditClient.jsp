<%--
  Created by IntelliJ IDEA.
  User: SuperUser
  Date: 18.07.2018
  Time: 20:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" pageEncoding="UTF-8" session="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Edit Client</title>
</head>
    <body>
    <a href="ShowClients.jsp">Назад</a>
    <form action="${pageContext.servletContext.contextPath}/clients/create" method="POST">
        <table>
            <tr>
                <td align="right" >Change Name : </td>
                <td>
                    <input type="text" name="name" value="${client.getName()}">
                </td>
            </tr>
            <tr>
                <td align="right" >Change id : </td>
                <td>
                    <input type="text" name="id" value="${client.getId()}">
                </td>
            </tr>
            <td><input type="submit" align="center" value="Submit"/></td>
            </tr>
        </table>
    </form>
    <table style="color:#000000" border="1">
    <tr>
        <td style="border: lightslategray">Car name</td>
        <td style="border: lightslategray">Car Id</td>
    </tr>

    <c:forEach items="${cars}" var="car" varStatus="status">
        <tr>

            <td>${car.getModel()}</td>
            <td>${car.getId()}</td>
                       <td>
                <a href="${pageContext.servletContext.contextPath}/car/delete?id=${client.id}">Удалить</a></td>
        </tr>
    </c:forEach>
    </table>

    </body>
</html>
