<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<style><%@include file="/resources/css/treeni.css"%></style>
	<meta charset="utf-8">
	<title>Treenitulokset</title>
</head>
<body>
	<h1>Treenitulokseni v.2019</h1>
	<table id="taulukot">
		<tbody class="tulos" id="rinta">
		<tr>
			<td><h3>Rinta/Olkap‰‰/K‰det</h3><td>
		</tr>
		<c:forEach items="${rintaTulokset}" var="rintaTulokset">
			<tr>
				<td><br><p><b>Viikko	<c:out value="${rintaTulokset.id}"/></b></p></td>
			</tr>
			<tr>
				<td><br><p><b>Penkkipunnerrus</b></p></td>
				<td><br><p><c:out value="${rintaTulokset.penkkiTulos}"/></p></td>
			</tr>
			<tr>	
				<td><p><b>Vinopenkki</b></p></td>
				<td><p><c:out value="${rintaTulokset.vinopenkkiTulos}"/></p></td>
			</tr>
			<tr>	
				<td><p><b>Ristitalja</b></p></td>
				<td><p><c:out value="${rintaTulokset.ristitaljaTulos}"/></p></td>
			</tr>
			<tr>	
				<td><p><b>Levitykset maaten</b></p></td>
				<td><p><c:out value="${rintaTulokset.flyesTulos}"/></p></td>
			</tr>
			<tr>	
				<td><p><b>Takaolkap‰‰t kulmassa</b></p></td>
				<td><p><c:out value="${rintaTulokset.takaolkaTulos}"/></p></td>
			</tr>
			<tr>	
				<td><p><b>Vipunostot sivulle</b></p></td>
				<td><p><c:out value="${rintaTulokset.vipariSTulos}"/></p></td>
			</tr>
			<tr>	
				<td><p><b>Vipunostot eteen</b></p></td>
				<td><p><c:out value="${rintaTulokset.vipariETulos}"/></p></td>
			</tr>
			<tr>	
				<td><p><b>Kapea penkkipunnerrus</b></p></td>
				<td><p><c:out value="${rintaTulokset.kapPenkkiTulos}"/></p></td>
			</tr>
			<tr>	
				<td><p><b>Hauisk‰‰nto tangolla</b></p></td>
				<td><p><c:out value="${rintaTulokset.hauiskaantoTulos}"/></p></td>
			</tr>
			<tr>
				<td>
					<div class="submit"><a href="paivita-rinta?id=${rintaTulokset.id}">Muokkaa</a></div>
				</td>
			<tr>
				<td>
					<div class="button"><a href="poista-rinta?id=${rintaTulokset.id}">Poista</a></div>
				</td>
			</tr>
		</c:forEach>
		</tbody>
		<tbody class="tulos" id="jalat">
			<tr>
				<td><h3>Jalat/pohkeet</h3></td>
			</tr>
		<c:forEach items="${jalatTulokset}" var="jalatTulokset">
			<tr>
				<td><br><p><b>Viikko	<c:out value="${jalatTulokset.id}"/></b></p></td>
			</tr>
			<tr>
				<td><p><br><b>Takakyykky</b></p></td>
				<td><p><br><c:out value="${jalatTulokset.kyykkyTulos}"/></p></td>
			</tr>
			<tr>
				<td><p><b>Hack-kyykky</b></p></td>
				<td><p><c:out value="${jalatTulokset.hackTulos}"/></p></td>
			</tr>
				<td><p><b>Jalkapr‰ssi</b></p></td>
				<td><p><c:out value="${jalatTulokset.prassiTulos}"/></p></td>
			<tr>
				<td><p><b>Takareidet maaten</b></p></td>
				<td><p><c:out value="${jalatTulokset.takareidetTulos}"/></p></td>
			</tr>
			<tr>
				<td><p><b>Askelk‰vely pitk‰</b></p></td>
				<td><p><c:out value="${jalatTulokset.askKavelTulos}"/></p></td>
			</tr>
			<tr>
				<td><p><b>Pohkeet seisten</b></p></td>
				<td><p><c:out value="${jalatTulokset.pohkeetTulos}"/></p></td>
			</tr>
			<tr>
				<td>
					<div class="button-paivita"><a href="paivita-jalat?id=${jalatTulokset.id}">Muokkaa</a></div>
				</td>
			<tr>
			<tr>
				<td>
					<div class="button"><a href="poista-jalka?id=${jalatTulokset.id}">Poista</a></div>
				</td>
			</tr>
		</c:forEach>
		</tbody>
		<tbody class="tulos" id="kadet">
			<tr>
				<td><h3>Olkap‰‰t/K‰det</h3></td>
			</tr>
		<c:forEach items="${olkaTulokset}" var="olkaTulokset">
			<tr>
				<td><p><br><p><b>Viikko		<c:out value="${olkaTulokset.id}"/></b></p></td>
		 	</tr>
			<tr>
				<td><p><br><b>Pystypunnerrus</b></p></td>
		 		<td><p><br><c:out value="${olkaTulokset.pystPunnerTulos}"/></p></td>
		 	</tr>
		 	<tr>
		 		<td><p><b>Takaolkap‰‰t koneessa</b></p></td>
		 		<td><p><c:out value="${olkaTulokset.takaolatTulos}"/></p></td>
		 	<tr>
		 	</tr>
		 		<td><p><b>Vipunostot sivulle koneessa</b></p></td>
		 		<td><p><c:out value="${olkaTulokset.vipariSivTulos}"/></p></td>
		 	<tr>
		 	</tr>
		 		<td><p><b>Pushdown taljassa</b></p></td>
		 		<td><p><c:out value="${olkaTulokset.ojentajaTaljaTulos}"/></p></td>
		 	<tr>
		 	</tr>
		 		<td><p><b>Scott-hauisk‰‰ntˆ</b></p></td>
		 		<td><p><c:out value="${olkaTulokset.hauisScottTulos}"/></p></td>
		 	<tr>
		 		<td><p><b>P‰‰n takaa punnerrus</b></p></td>
		 		<td><p><c:out value="${olkaTulokset.ojentajaPunnerTulos}"/></p></td>
		 	</tr>
		 	<tr>
		 		<td><p><b>Hauisk‰‰ntˆ k‰sipainoilla</b></p></td>
		 		<td><p><c:out value="${olkaTulokset.hauisKPTulos}"/></p></td>
		 	</tr>
		 	<tr>
				<td>
					<div class="button-paivita"><a href="paivita-kadet?id=${olkaTulokset.id}">Muokkaa</a></div>
				</td>
			<tr>
		 	<tr>
				<td>
					<div class="button"><a href="poista-kasi?id=${olkaTulokset.id}">Poista</a></div>
				</td>
			</tr>
		</c:forEach>
		</tbody>
		<tbody class="tulos" id="selka">
			<tr>
				<td><h3>Selk‰/Takareidet</h3></td>
			</tr>
		<c:forEach items="${selkaTulokset}" var="selkaTulokset">
			<tr>
				<td><br><p><b>Viikko	<c:out value="${selkaTulokset.id}"/></b></p></td>
			</tr>
			<tr>
				<td><p><br><b>Kulmasoutu tangolla</b></p></td>
				<td><p><br><c:out value="${selkaTulokset.kulmasoutuTulos}"/></p></td>
			</tr>
			<tr>
				<td><p><b>Yl‰talja</b></p></td>
				<td><p><c:out value="${selkaTulokset.ylaTaljaTulos}"/></p></td>
			</tr>
			<tr>
				<td><p><b>Yhden k‰den soutuliike</b></p></td>
				<td><p><c:out value="${selkaTulokset.yhdKadenSoutuTulos}"/></p></td>
			</tr>
			<tr>
				<td><p><b>Alatalja</b></p></td>
				<td><p><c:out value="${selkaTulokset.alataljaTulos}"/></p></td>
			</tr>
			<tr>
				<td><p><b>SJMV</b></p></td>
				<td><p><c:out value="${selkaTulokset.sjmvTulos}"/></p></td>
			</tr>
			<tr>
				<td><p><b>Takareidet seisten (yhdell‰ jalalla)</b></p></td>
				<td><p><c:out value="${selkaTulokset.takareisiTulos}"/></p></td>
			</tr>
			<tr>
				<td>
					<div class="button-paivita"><a href="paivita-selka?id=${selkaTulokset.id}">Muokkaa</a></div>
				</td>
			<tr>
			<tr>
				<td>
					<div class="button"><a href="poista-selka?id=${selkaTulokset.id}">Poista</a></div>
				</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
</body>
</html>