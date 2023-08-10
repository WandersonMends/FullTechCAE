<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Altera��o de Usuarios</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css"
	rel="stylesheet">
<style>
.margem-botao {
	margin-top: 10px;
	margin-bottom: 10px;
}

.borda {
	margin: auto;
	max-width: 400px;
}
</style>
</head>
<body>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> <%@ taglib
    uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

	<div class="container borda">
		<h2 class="text-primary text-center">Altera��o de Usuarios</h2>
		<form action="/usuarios/alterar" method="post">
<%-- 			<input type="hidden" name="dtCadastro" value="${usuario.dtCadastro}" /> --%>
			<input name="dtCadastro" value="${usuario.dtCadastro}" />
			<div class="mb-3">
				<label class="form-label">Nome:</label> <input type="text"
					name="nome" class="form-control" value="${usuario.nome}" />
			</div>

			<div class="mb-3">
				<label class="form-label">Email:</label> <input type="text"
					name="email" class="form-control" value="${usuario.email}" />
			</div>

			<!-- 			<div class="mb-3"> -->
			<!-- 				<label class="form-label">Senha:</label> <input type="text" -->
			<!-- 					name="telefone" class="form-control" /> -->
			<!-- 			</div> -->
<!-- 			<div class="mb-3"> -->
<!-- 				<label class="form-label">Data:</label> <input type="date" -->
<%-- 					name="dataCadastro" class="form-control" value="${usuario.dtCadastro}"/> --%>
<%-- 				<fmt:formatDate value="${usuario.dtCadastro}" pattern="dd/MM/yyyy" name="dataCadastro"/> --%>
<!-- 			</div> -->

			<div class="mb-3">
				<label class="form-label">N�vel Acesso:</label> <select
					class="form-control" name="nivelAcesso" id="nivelacesso">
					<option value="ADMINISTRADOR">Administrador</option>
					<option value="FUNCIONARIO">Funcion�rio</option>
					<option value="MORADOR">Morador</option>
				</select>
			</div>

			<button type="submit" class="btn btn-primary">Alterar</button>
			<a href="/usuarios/lista" class="btn btn-secondary"> Voltar para a lista</a>

		</form>

	</div>

</body>
</html>