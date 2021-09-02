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
    <H3>Student List ::</H3><hr/>
    <div class="row pl-2">
        <%
            Collection<Student> students = (Collection<Student>) request.getAttribute("students");
            for (Student student : students) {%>
        <div class="col-2 bg-light">
            <div>Id: <%= student.getId()%></div>
            <div>Name: <%= student.getName()%></div>
            <div>gpax: <%= student.getGpax()%></div>
            <div><hr></div>
        </div>
        <%}%>
    </div>
</div>
</body>
</html>
