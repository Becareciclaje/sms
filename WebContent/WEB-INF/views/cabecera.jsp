
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
${empty usuario || usuario.id eq 0  }
<c:if test="${empty usuario || usuario.id eq 0  }">
<c:redirect url="/"></c:redirect>
</c:if>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>cj:SMS</title>
<link href="resources/css/curso.css" rel="stylesheet">
<script type="text/javascript" src="resources/js/envios.js"></script>
</head>
<body class="azul">
	<jsp:include page="header.jsp"></jsp:include>