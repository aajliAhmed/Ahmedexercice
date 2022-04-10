<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="styLesheet" type="text/css" href="css/style.css" />
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<div class="class">
	<p><h3>Produit</h3></p>
		<table border="1" cellpadding="15">
			<tr>
				<th>nomProd</th>
				<th>Prix</th>
				<th>nombreItem</th>
			</tr>
			<c:forEach items="${produits}" var="p">
				<tr>
					<td>${p.nomProd }</td>
					<td>${p.prix }</td>
					<td>${p.nombreItem }</td>
				</tr>
			</c:forEach>
		</table>
	
	<div>
		<form action="controleur.php" method="post">
		<table>
			<tr>
				<td>nomProd :</td>
				<td><input type="text" name="nomProd" ></td>
			</tr>
			<tr>
				<td>prix :</td>
				<td><input type="number" name="prix"></td>
			</tr>
			<tr>
				<td>quantite :</td>
				<td><input type="number" name="nombreItem" ></td>
			</tr>
			<tr>
				<td>
				<input type="submit" name="action" value="save">
				</td>
			</tr>
		</table>
	</form>
	</div>
	</div>
	<div class="class1">
	<p><h3>Categorie</h3></p>
		<table  border="1" cellpadding="15">
			<tr>
				<th>nomCat</th>
			</tr>
			<c:forEach items="${cats}" var="c">
				<tr>
					<td>${c.nomCat}</td>
				</tr>
			</c:forEach>
		</table>
		<form action="controleur.php" method="post">
		<table>
			<tr>
				<td>nomCat :</td>
				<td><input type="text" name="nomCat" ></td>
			</tr>
			<tr>
				<td>
				<input type="submit" name="action" value="save1">
				</td>
			</tr>
		</table>
	</form>
	</div>
	<div class="class2">
	
	<p><h3>Rayon</h3></p>
		<table  border="1" cellpadding="15">
			<tr>
				<th>rayonFrais</th>
				<th>nomResponsable</th>
			</tr>
			<c:forEach items="${rayon}" var="r">
				<tr>
			
					<td>${r.rayonFrais}</td>
					<td>${r.nomResponsable}</td>
				</tr>
			</c:forEach>
		</table>
		<form action="controleur.php" method="post">
		<table>
			<tr>
				<td>rayonFrais :</td>
				<td><input type="text" name="rayonFrais"></td>
				
			</tr>
			<tr>
				<td>nomResponsable :</td>
				<td><input type="text" name="nomResponsable" ></td>
			</tr>
			<tr>
				<td>
				<input type="submit" name="action" value="save2">
				</td>
			</tr>
		</table>
	</form>
	</div>
</body>
</html>