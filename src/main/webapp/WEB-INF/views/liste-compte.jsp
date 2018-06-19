<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false" session="true"%>
<%-- Import librairie de tags JSTL --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="fr">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">

<link rel="stylesheet" href="<c:url value="/css/bootstrap.min.css" />" />
<link rel="stylesheet" href="<c:url value="/css/style.css" />" />
<title>Liste des comptes</title>
</head>
<body>
	<div class="container-fluid">
		<header>
			<div class="row shadow">
				<div class="col-2 p-3">
					<img src="img/proxybank.png" alt="" class="img-fluid">
				</div>
				<div class="col-8 d-flex justify-content-center align-items-center">
					<h1>Proxybank System</h1>
				</div>
				<!-- informations de la personne connéctée -->
				<div
					class="col-2  d-flex justify-content-center align-items-center flex-column">
					<h3>Bienvenue</h3>
					<span class="text-center"><c:out value="${username}"/></span>
					<a href="#" class="text-center">Se deconnecter</a>
				</div>
			</div>
			<div class="row mt-3">
				<div class="col-md-6 mx-auto">
					<ul class="nav justify-content-center">
						<li class="nav-item"><a class="nav-link active" href="<c:url value="/liste-client"/>">Liste
								des clients</a></li>
						<li class="nav-item"><a class="nav-link" href="<c:url value="/virement"/>">Virement</a></li>
					</ul>
				</div>
			</div>

		</header>
		<div class="row">
			<div class="col-10 mx-auto">
				<h2>GESTION DES COMPTES</h2>
				<table class="table">
					<thead class="thead-light">
						<tr>
							<th scope="col">N°Compte</th>
							<th scope="col">Type de compte</th>
							<th scope="col">Solde</th>
							<th scope="col">Actions</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="compte" items="${sessionScope.listeCompte}">
							<tr>
								<th scope="row">${compte.id}</th>
								<td></td>
								<td>${compte.solde}</td>
								<td><a href="#" class="badge badge-primary perso-pill">Virement</a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>

	</div>
</body>

</html>