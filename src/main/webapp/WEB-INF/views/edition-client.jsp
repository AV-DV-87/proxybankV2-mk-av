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
<title>Edition Client</title>
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
		<div class="col-md-6 mx-auto">
			<h2>Client à modifier :</h2>

			<form method="post">
				<div class="form-row">
						<%-- ajout d'un champs hidden contenant l'id pour ne pas perdre le client entre l'affichage et l'update --%>
						<input name="id" type="hidden" required class="form-control"
							id="id" placeholder="id" value="${id}">
					<div class="form-group col-md-6">
						<label for="nom">Nom</label> <input name="nom" type="text"
							minlength="2" maxlength="40" required class="form-control"
							id="nom" placeholder="Nom" value="${nom}">
					</div>
					<div class="form-group col-md-6">
						<label for="prenom">Prenom</label> <input name="prenom"
							type="text" minlength="2" maxlength="40" required
							class="form-control" id="prenom" placeholder="Prenom"
							value="${prenom}">
					</div>
				</div>
				<div class="form-group">
					<label for="email">Email</label> <input name="email" type="email"
						class="form-control" id="email" placeholder="email"
						value="${email}">
				</div>
				<div class="form-group">
					<label for="adresse">Addresse</label> <input name="adresse"
						type="text" class="form-control" id="adresse"
						placeholder="adresse" value="${adresse}">
				</div>
				<div class="form-row">
					<div class="form-group col-md-4">
						<label for="codep">Code postal</label> <input name="codep" type="text"
							class="form-control" id="codep" value="${codep}">
					</div>
					<div class="form-group col-md-8">
						<label for="ville">Ville</label> <input name="ville" type="text"
							class="form-control" id="ville" value="${ville}">
					</div>
				</div>
				<button type="submit" class="btn btn-primary">Modifier</button>
			</form>
		</div>

	</div>
</body>

</html>