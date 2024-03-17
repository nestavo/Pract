<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulario de registro</title>
</head>
<body>
<form:form action="procesarFormulario" modelAttribute="elAlumno">

Nombre: <form:input path="nombre"/>
<form:errors path ="nombre" Style="color:red"/>

<br/><br/><br/>


Apellido: <form:input path="apellido"/>

<br/><br/><br/>

Edad: <form:input path="edad"/>
<form:errors path= "edad" Style="color:red"/>
<br/><br/><br/>

Asignaturas optativas:

<form:select path="optativa" multiple="true">

<form:option value="Diseño tecnico" label="Diseño"/>
<form:option value="Matematicas aplicadas" label="Matematicas"/>
<form:option value="Dibujo tecnico" label="Dibujo"/>
<form:option value="Materiales tecnicos" label="Materiales"/>

</form:select>


<br/><br/><br/>

Seleccione provincia:
<br/>

Barcelona<form:radiobutton path="ciudadEstudios" value="Barcelona"/>
Madrid<form:radiobutton path="ciudadEstudios" value="Madrid"/>
Valencia<form:radiobutton path="ciudadEstudios" value="Valencia"/>
Sevilla<form:radiobutton path="ciudadEstudios" value="Sevilla"/>

<br/><br/><br/>

Ingles<form:checkbox path="idiomasAlumno" value="Ingles"/>
Castellano<form:checkbox path="idiomasAlumno" value="Castellano"/>
Chino<form:checkbox path="idiomasAlumno" value="Chino"/>

<br/><br/><br/>


<input type="submit" value="enviar">




</form:form>


</body>
</html>