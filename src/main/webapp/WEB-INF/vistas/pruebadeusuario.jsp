<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>DATOS DE USUARIOS</title>
</head>
<body>
<c:forEach var="usuarios" items="${usuarios}">
    <h1>${usuarios.email}</h1>
    <h2>${usuarios.rol}</h2>
    <br><br>
</c:forEach>

</body>
</html>
