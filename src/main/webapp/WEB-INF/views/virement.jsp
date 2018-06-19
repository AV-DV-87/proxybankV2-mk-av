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
<title>Virement</title>
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
					<span class="text-center"><c:out value="${username}" /></span> <a
						href="#" class="text-center">Se deconnecter</a>
				</div>
			</div>
			<div class="row mt-3">
				<div class="col-md-6 mx-auto">
					<ul class="nav justify-content-center">
						<li class="nav-item"><a class="nav-link active"
							href="<c:url value="/liste-client"/>">Liste des clients</a></li>
						<li class="nav-item"><a class="nav-link"
							href="<c:url value="/virement"/>">Virement</a></li>
					</ul>
				</div>
			</div>

		</header>
		<div class="row">

			<div class="col-md-6 mx-auto">
				<h2>VIREMENT</h2>
				<div class="form-group">
					<label for="compted">Compte à débiter</label> <select
						name="compted" type="email" class="form-control" id="compted"
						placeholder="Compte à débiter">
						<option value=""></option>
						<option value=""></option>
					</select>
				</div>
				<div class="form-group">
					<label for="comptec">compte à créditer</label> <select
						name="comptec" type="text" class="form-control" id="comptec"
						placeholder="compte à créditer">
						<option value=""></option>
						<option value=""></option>
					</select>
				</div>
				<div class="form-row">
					<div class="form-group offset-md-6 col-md-6">
						<label for="montant">Montant</label> <input type="text" type=""
							class="form-control" id="montant"
							placeholder="montant du virement ">
					</div>
				</div>
			</div>
		</div>

	</div>
</body>

</html>