<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
	<style><%@include file="/resources/css/treeni.css"%></style>
	<title>Tuloslomake</title>
</head>
<body>
	<h1>Muokkaa Käsitreeniä</h1>
	<form action="paivita-kadet" method="post">
		<table id="taulukot">
		<tbody class="tulos" id="kadet">
			<tr>
				<td><h3>Olkapäät, Kädet</h3></td>
			</tr>
			<tr>
				<td><p>Viikko</p>
				<td><input type="text" name="id"size="4" value="${id}"></td>
			<tr>
			<tr>
				<td><p>Pystypunnerrus</p></td>
				<td><input type="text" name="pystPun" size="4"></td>
			</tr>
			<tr>
				<td><p>Takaolkapäät koneessa</p></td>
				<td><input type="text" name="takaolat" size="4"></td>
			</tr>
			<tr>
				<td><p>Vipunostot sivulle koneessa</p></td>
				<td><input type="text" name="vipariSiv" size="4"></td>
			</tr>
			<tr>
				<td><p>Ojentajapunnerrus taljassa</p></td>
				<td><input type="text" name="ojenTalj" size="4"></td>
			</tr>
			<tr>
				<td><p>Hauiskääntö (scott)</p></td>
				<td><input type="text" name="hauisScott" size="4"></td>
			</tr>
			<tr>
				<td><p>Ojentajapunnerrus</p></td>
				<td><input type="text" name="ojenPun" size="4"></td>
			</tr>
			<tr>
				<td><p>Hauiskääntö käsipainoilla</p></td>
				<td><input type="text" name="hauisKP" size="4"></td>
			</tr>
			<tr>
				<td><input type="submit" class="btn btn-succes"
					value="Tallenna"/>
				<td>
			</tr>
			<tr>
				<td>
					<div class="button">
						<a href="listaa-tulokset">Peruuta</a>
					</div>
				</td>
			</tr>
			</tbody>
		</table>
	</form>
</body>
</html>