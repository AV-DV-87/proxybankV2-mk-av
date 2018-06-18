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
<title>Connexion</title>
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
					<h2 class="text-center">Conseiller connecté</h2>
					<a href="" class="text-center">Se deconnecter</a>
				</div>
			</div>
			<div class="row mt-3">
				<div class="col-md-6 mx-auto">
					<ul class="nav justify-content-center">
						<li class="nav-item"><a class="nav-link active" href="#">Liste
								des clients</a></li>
						<li class="nav-item"><a class="nav-link" href="#">Se
								connecter</a></li>
					</ul>
				</div>
			</div>

		</header>
		<div class="row">
			<div class="col-10 mx-auto">
				<h2>GESTION DES CLIENTS</h2>
				<table class="table">
					<thead class="thead-light">
						<tr>
							<th scope="col">N°Client</th>
							<th scope="col">Nom</th>
							<th scope="col">Prenom</th>
							<th scope="col">Actions</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<th scope="row">1</th>
							<td>Mark</td>
							<td>Otto</td>
							<td><a href="#" class="badge badge-primary perso-pill">Editer</a>
								<a href="#" class="badge badge-primary perso-pill">Liste
									Compte</a> <a href="#" class="badge badge-primary perso-pill">Virement</a></td>
						</tr>
						<tr>
							<th scope="row">2</th>
							<td>Jacob</td>
							<td>Thornton</td>
							<td><a href="#" class="badge badge-primary perso-pill">Editer</a>
								<a href="#" class="badge badge-primary perso-pill">Liste
									Compte</a> <a href="#" class="badge badge-primary perso-pill">Virement</a></td>
						</tr>
						<tr>
							<th scope="row">3</th>
							<td>Larry</td>
							<td>the Bird</td>
							<td><a href="#" class="badge badge-primary perso-pill">Editer</a>
								<a href="#" class="badge badge-primary perso-pill">Liste
									Compte</a> <a href="#" class="badge badge-primary perso-pill">Virement</a>
							</td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</html>