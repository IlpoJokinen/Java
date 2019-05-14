<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<style><%@include file="/resources/css/treeni.css"%></style>
	<title>Tuloslomake</title>
</head>
<body>
	<h1>Lisää tulokset</h1>
	<form action="lisaa-rinta" method="post">
		<table id="taulukot">
		<tbody class="tulos" id="rinta">
			<tr>
				<td><h3>Rinta, Olkapää, Kädet</h3></td>
			</tr>
			<tr>
				<td><p>Viikko:</p></td>
				<td><input type="text" name="id" size="4"></td>
			</tr>
			<tr>
				<td><p>Penkkipunnerrus</p></td>
				<td><input type="text" name="penkki" size="4"></td>
			</tr>
			<tr>
				<td><p>Vinopenkki</p></td>
				<td><input type="text" name="vinopenkki" size="4"></td>
			</tr>
			<tr>
				<td><p>Ristitalja</p></td>
				<td><input type="text" name="ristitalja" size="4"></td>
			</tr>
			<tr>
				<td><p>Levitykset maaten</p></td>
				<td><input type="text" name="flyes" size="4"></td>
			</tr>
			<tr>
				<td><p>Takaolkapäät kulmassa</p></td>
				<td><input type="text" name="takaolka" size="4"></td>
			</tr>
			<tr>
				<td><p>Vipunostot sivulle</p></td>
				<td><input type="text" name="vipariS" size="4"></td>
			</tr>
			<tr>
				<td><p>Vipunostot eteen</p></td>
				<td><input type="text" name="vipariE" size="4"></td>
			</tr>
			<tr>
				<td><p>Kapea penkkipunnerrus</p></td>
				<td><input type="text" name="kapPenkki" size="4"></td>
			</tr>
			<tr>
				<td><p>Hauiskääntö tangolla</p></td>
				<td><input type="text" name="hauiskaanto" size="4"></td>
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

	<form action="lisaa-jalka" method="post">
		<table id="taulukot">
		<tbody class="tulos" id="jalat">
			<tr>
				<td><h3>Jalat, Pohkeet</h3></td>
			</tr>
			<tr>
				<td><p>Viikko:</p></td>
				<td><input type="text" name="id" size="4"></td>
			</tr>
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

	<form action="lisaa-kasi" method="post">
		¨
		<table id="taulukot">
		<tbody class="tulos" id="kadet">
			<tr>
				<td><h3>Olkapäät, Kädet</h3></td>
			</tr>
			<tr>
				<td><p>Viikko:</p></td>
				<td><input type="text" name="id" size="4"></td>
			</tr>
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
	<form action="lisaa-selka" method="post">
		<table id="taulukot">
		<tbody class="tulos" id="selka">
			<tr>
				<td><h3>Selkä, Takareidet</h3></td>
			</tr>
			<tr>
				<td><p>Viikko:</p></td>
				<td><input type="text" name="id" size="4"></td>
			</tr>
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