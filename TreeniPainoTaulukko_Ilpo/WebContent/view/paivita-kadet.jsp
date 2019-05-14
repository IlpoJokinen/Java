<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
	<style><%@include file="/resources/css/treeni.css"%></style>
	<title>Tuloslomake</title>
</head>
<body>
	<h1>Muokkaa K�sitreeni�</h1>
	<form action="paivita-kadet" method="post">
		<table id="taulukot">
		<tbody class="tulos" id="kadet">
			<tr>
				<td><h3>Olkap��t, K�det</h3></td>
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
				<td><p>Takaolkap��t koneessa</p></td>
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
				<td><p>Hauisk��nt� (scott)</p></td>
				<td><input type="text" name="hauisScott" size="4"></td>
			</tr>
			<tr>
				<td><p>Ojentajapunnerrus</p></td>
				<td><input type="text" name="ojenPun" size="4"></td>
			</tr>
			<tr>
				<td><p>Hauisk��nt� k�sipainoilla</p></td>
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