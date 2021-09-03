<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: koraw
  Date: 9/2/2021
  Time: 22:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.Collection" %>
<%@ page import="sit.int202.lab02.models.Student" %><%--
  Created by IntelliJ IDEA.
  User: Khaitong Lim
  Date: 8/23/2021
  Time: 10:09 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student List::</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css"
          integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <H3>Student List ::</H3>
    <hr/>
    <div class="row pl-2">
        <%--        <%--%>
        <%--            Collection<Student> students = (Collection<Student>) request.getAttribute("students");--%>
        <%--            for (Student student : students) {%>--%>
        <c:forEach items="${students}" var="get" varStatus="vs">
            <div class="col-2 p-1 m-2 border border-secondary
                ${vs.count%5==1 || vs.count%5==3 || vs.count%5==0? 'bg-secondary' : ''}">
                <div>Id: ${get.id}</div>
                <div>Name: ${get.name}</div>
                <div>Gpax: ${get.gpax}</div>
                <div>
                    <hr>
                </div>
            </div>
            <%--        <%}%>--%>
        </c:forEach>
    </div>
    <a href="index.jsp">
        <button> [GO Back]</button>
    </a>
</div>
</body>
</html>
