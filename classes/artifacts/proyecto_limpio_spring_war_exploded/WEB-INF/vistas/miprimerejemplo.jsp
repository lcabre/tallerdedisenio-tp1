<%--
  Created by IntelliJ IDEA.
  User: Leo
  Date: 7/9/2017
  Time: 20:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Hola Seba</title>
</head>
<body>
<h1>Hola ${nombre} </h1>
<h1>${lista}</h1>
<h1>${lista.get(1)}</h1>
<c:forEach var="objeto" items="${lista}">
    <h1>${objeto}</h1>
</c:forEach>
</body>
</html>
