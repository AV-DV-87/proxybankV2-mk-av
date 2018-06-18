<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" session="true"%>
<%-- Import librairie de tags JSTL --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
            <div class="col-2  d-flex justify-content-center align-items-center flex-column">
                <h2 class="text-center">Conseiller connecté</h2>
                <a href="" class="text-center">Se deconnecter</a>
            </div>
        </div>
        <div class="row mt-3">
            <div class="col-md-6 mx-auto">
                <ul class="nav justify-content-center">
                    <li class="nav-item">
                        <a class="nav-link active" href="#">Liste des clients</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Se connecter</a>
                    </li>
                </ul>
            </div>
        </div>

    </header>
    <div class="row">
        <div id="connexion" class="col-md-6 mx-auto bg-bank p-4">
            <h2>CONNEXION</h2>
            <form>
                <div class="form-group">
                    <label for="username">Nom d'utilisateur</label>
                    <input type="text" class="form-control" id="username" aria-describedby="emailHelp"
                           name="username" placeholder="Enter email">
                </div>
                <div class="form-group">
                    <label for="password">Mot de passe</label>
                    <input name="password" type="password" class="form-control" id="password" placeholder="Password">
                </div>
                <div class="form-group form-check">
                    <input type="checkbox" class="form-check-input" id="exampleCheck1">
                    <label class="form-check-label" for="exampleCheck1">Check me out</label>
                </div>
                <button type="submit" class="btn btn-primary">Submit</button>
            </form>
        </div>
    </div>

</div>
</body>

</html>