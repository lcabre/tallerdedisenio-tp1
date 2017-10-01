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
                <form:form action="/usuario/store" method="POST" modelAttribute="persona">
                    <h3 class="form-signin-heading">Nueva Persona</h3>

                    <%--Elementos de entrada de datos, el elemento path debe indicar en que atributo del objeto usuario se guardan los datos ingresados--%>
                    <label for="nombre">Nombre</label>
                    <form:input path="nombre" id="nombre" type="text" class="form-control" />

                    <label for="apellido">Apellido</label>
                    <form:input path="apellido" type="text" id="apellido" class="form-control"/>

                    <label for="apellido">Email</label>
                    <form:input path="email" type="email" id="email" class="form-control"/>

                    <button class="btn btn-lg btn-primary btn-block" Type="Submit">Guardar</button>
                </form:form>
            </div>
        </div>
    </div>
</body>
</html>
