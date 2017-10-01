<%--
  Created by IntelliJ IDEA.
  User: Leo
  Date: 28/9/2017
  Time: 19:50
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Nueva Persona</title>
    <link href="../css/bootstrap.min.css" rel="stylesheet" >
    <!-- Bootstrap theme -->
    <link href="../css/bootstrap-theme.min.css" rel="stylesheet">
</head>
<body>
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <label for="">nombre:</label> ${persona.getNombre()}
                <label for="">apellido:</label> ${persona.getApellido()}
                <label for="">email:</label> ${persona.getEmail()}
            </div>
        </div>
    </div>
</body>
</html>
