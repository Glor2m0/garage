<%--
  Created by IntelliJ IDEA.
  User: SuperUser
  Date: 18.07.2018
  Time: 20:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" pageEncoding="UTF-8" session="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>MyWebGarage</title>
</head>
<p align="center">My Web Garage v 0.5-beta</p>
            <body>
                <a href="${pageContext.servletContext.contextPath}/views/CreateClient.jsp">Добавить клиента</a>
                <a href="${pageContext.servletContext.contextPath}/clients">База клиентов</a>
                    <div style="border: brown">
                        <tr>
                         <td>Total Clients</td>
                         <td>Total Cars</td>
                        </tr>
<%--  <tr>
      <td>${Garage.getClients}</td>
      <td>${Garage.getCars}</td>
  </tr>
--%>
                    </div>
</body>
</html>
