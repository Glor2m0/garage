<%--
  Created by IntelliJ IDEA.
  User: SuperUser
  Date: 18.07.2018
  Time: 20:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" pageEncoding="UTF-8" session="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Show Clients</title>
</head>
<body>

<a align="center" href="${pageContext.servletContext.contextPath}/views/StartPage.jsp">На главную</a>
    <c:forEach items="${clients}" var="client" varStatus="status">

        <table border="1">
            <tr>
                <td>Client name</td>
                <td>Id</td>
                <td>Redactor</td>
            </tr>

                <tr valign="top">
                    <td>${client.name}</td> <td> ${client.id}</td>
                    <td>
                        <a href="${pageContext.servletContext.contextPath}/clients/edit?id=${client.id}">Редактировать</a>
                        <a href="${pageContext.servletContext.contextPath}/clients/add?id=${client.id}">Добавть машину</a>
                        <a href="${pageContext.servletContext.contextPath}/clients/delete?id=${client.id}">Удалить</a>
                    </td>
                </tr>





    </table>
</c:forEach>

</body>
</html>
