<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro de usuário</title>
</head>
<body>
	<form action="cadastroUsuario" method="post">
		Digite seu nome: <input type="text" name="name" />
		<br />
		Digite seu email: <input type="email" name="email" />
		<br />
		<input type="submit" value="Cadastrar"/>
	</form>
</body>
</html>