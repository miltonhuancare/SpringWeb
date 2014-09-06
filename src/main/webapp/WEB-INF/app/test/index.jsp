<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>${Titulo}</title>
    </head>
    <body>
        <h1>${Titulo}</h1>
        <p>${Contenido}</p>
        <p>${programa.descripcion}</p>
        
        
    <c:forEach var="i" items="${nombres}">
        <p><c:out value="${i}"/></p>
    </c:forEach>
        
    </body>
</html>
