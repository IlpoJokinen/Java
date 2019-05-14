<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
	<style><%@include file="/resources/css/treeni.css"%></style>
	<title>Tuloslomake</title>
</head>
<body>
	<h1>Muokkaa Rintatreeni‰</h1>
	<form action="paivita-rinta" method="post">
		<table id="taulukot">
			<tbody class="tulos" id="rinta">
			<tr>
				<td><h3>Rinta, Olkap‰‰, K‰det</h3></td>
			</tr>
			<tr>
				<td><p>Viikko</p>
				<td><input type="text" name="id"size="4" value="${id}"></td>
			<tr>
			<tr>
				<td><p>Penkkipunnerrus</p></td>
				<td><input type="text" name="penkki"size="4"></td>
			</tr>
			<tr>
				<td><p>Vinopenkki</p></td>
				<td><input type="text" name="vinopenkki"size="4"></td>
			</tr>
			<tr>
				<td><p>Ristitalja</p></td>
				<td><input type="text" name="ristitalja"size="4"></td>
			</tr>
			<tr>
				<td><p>Levitykset maaten</p></td>
				<td><input type="text" name="flyes"size="4"></td>
			</tr>
			<tr>
				<td><p>Takaolkap‰‰t kulmassa</p></td>
				<td><input type="text" name="takaolka"size="4"></td>
			</tr>
			<tr>
				<td><p>Vipunostot sivulle</p></td>
				<td><input type="text" name="vipariS"size="4"></td>
			</tr>
			<tr>
				<td><p>Vipunostot eteen</p></td>
				<td><input type="text" name="vipariE"size="4"></td>
			</tr>
			<tr>
				<td><p>Kapea penkkipunnerrus</p></td>
				<td><input type="text" name="kapPenkki"size="4"></td>
			</tr>
			<tr>
				<td><p>Hauisk‰‰ntˆ tangolla</p></td>
				<td><input type="text" name="hauiskaanto"size="4"></td>
			</tr>
			<tr>
				<td><input type="submit" class="btn btn-succes"
					value="Tallenna" />
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