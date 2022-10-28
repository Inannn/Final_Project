
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
	   xmlns:th="http://www.thymeleaf.org">
<head>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootswatch/4.5.2/cosmo/bootstrap.min.css" />
	<script src= "https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" ><</script>
</head>
<body>
<div>
	<h2 >Vaccination Centre - Patience Registration</h2>
	<tr>
	<div align ="left" >
	
	<h3><a th:href="@(`/new`)">Add new</a></h3>
	
	</div>
	
	<tr>
	
	<div class="col-sm-5" align = "center">
	<div class="panel-body" align = "center" >
	
	
	<table class="table">
	<thead class="thead-dark">
	<tr>
	
	<th>Patient ID</th>
	<th>Patient Name</th>
	<th>Patient Age</th>
	<th>Vaccine Type</th>
	<th>Edit</th>
	<th>Delete</th>
	</tr>
	</thead>
	<tbody>
	<tr th:each="patient : ${listpatient}">
	<td th:text="$(patient.id)">Patient ID</td>
	<td th:text="$(patient.patientname)">PatientName</td>
	<td th:text="$(patient.patientage)">PatientAge</td>
	<td th:text="$(patient.vaccinetype)">VaccineType</td>
	<td>
	<a th:href="@{`/edit/` + $(patient.id}}">Edit</a>
	</td>
	<td>
	<a th:href="@{`/delete/` + ${patient.id}}">Delete</a>
	</td>
	</tr>
	
	</tbody>
	</table>
	
	</div>
</html>