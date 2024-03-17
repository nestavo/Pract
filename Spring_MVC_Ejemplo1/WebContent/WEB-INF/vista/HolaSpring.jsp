<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="${request.contextPath}./recursos/estilos/miestilo.css">

</head>
<body>


Hola ${param.nombreCliente }.  Bienvenido al curso de spring

<p><br>

<h2>
Atencion a todos</h2>

${mensajeClaro }

</p>

<img alt="foto" src="${request.contextPath}./recursos/imgs/123.jpg">

</body>
</html>