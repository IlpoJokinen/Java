<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
	<style><%@include file="/resources/css/treeni.css"%></style>
	<title>Tuloslomake</title>
</head>
<body>
	<h1>Muokkaa Selkätreeniä</h1>
	<form action="paivita-selka" method="post">
		<table id="taulukot">
		<tbody class="tulos" id="selka">
			<tr>
				<td><h3>Selkä, Takareidet</h3></td>
			</tr>
			<tr>
				<td><p>Viikko</p>
				<td><input type="text" name="id"size="4" value="${id}"></td>
			<tr>
			<tr>
				<td><p>Kulmasoutu tangolla</p></td>
				<td><input type="text" name="kulSout" size="4"></td>
			</tr>
			<tr>
				<td><p>Ylätalja eteen</p></td>
				<td><input type="text" name="ylaTalja" size="4"></td>
			</tr>
			<tr>
				<td><p>Yhden käden soutuliike</p></td>
				<td><input type="text" name="yhdKaden" size="4"></td>
			</tr>
			<tr>
				<td><p>Alatalja kapea</p></td>
				<td><input type="text" name="alatalja" size="4"></td>
			</tr>
			<tr>
				<td><p>SJMV</p></td>
				<td><input type="text" name="sjmv" size="4"></td>
			</tr>
			<tr>
				<td><p>Takareidet seisten (yj)</p></td>
				<td><input type="text" name="takareisi" size="4"></td>
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