<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Confirmacion de Registro</title>
</head>
<body>

El alumno con nombre <strong>${elAlumno.nombre}</strong> y apellido ${elAlumno.apellido } y la edad <strong>${elAlumno.edad}</strong>

 se ha registrado con exito

<br/><br/>
La asignatura escogida es: ${elAlumno.optativa}

<br/><br/>

La provincia escogida es: ${elAlumno.ciudadEstudios}

<br/><br/>

El idioma escogido es: ${elAlumno.idiomasAlumno }
</body>
</html>