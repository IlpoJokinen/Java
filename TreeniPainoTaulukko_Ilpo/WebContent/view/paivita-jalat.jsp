<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
	<style><%@include file="/resources/css/treeni.css"%></style>
	<title>Tuloslomake</title>
</head>
<body>
	<h1>Muokkaa Jalkatreeniä</h1>
	<form action="paivita-jalat" method="post">
		<table id="taulukot">
			<tbody class="tulos" id="jalat">
			<tr>
				<td><h3>Jalat, Pohkeet</h3></td>
			</tr>
			<tr>
				<td><p>Viikko</p></td>
				<td><input type="text" name="id"size="4" value="${id}"></td>
			<tr>
			<tr>
				<td><p>Takakyykky tangolla</p></td>
				<td><input type="text" name="kyykky" size="4"></td>
			</tr>
			<tr>
				<td><p>Hack-kyykky</p></td>
				<td><input type="text" name="hack" size="4"></td>
			</tr>
			<tr>
				<td><p>Jalkaprässi</p></td>
				<td><input type="text" name="prassi" size="4"></td>
			</tr>
			<tr>
				<td><p>Takareidet maaten</p></td>
				<td><input type="text" name="takareidet" size="4"></td>
			</tr>
			<tr>
				<td><p>Askelkävely paikallaan</p></td>
				<td><input type="text" name="askKavel" size="4"></td>
			</tr>
			<tr>
				<td><p>Pohkeet seisten</p></td>
				<td><input type="text" name="pohkeet" size="4"></td>
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