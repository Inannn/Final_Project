<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
	   xmlns:th="http://www.thymeleaf.org">
<head>
<meta charset="utf-8" />
<title>Create New Product</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootswatch/4.5.2/cosmo/bootstrap.min.css" />
	<script src= "https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" ><</script>
</head>
<body>
<div align="center">
<h1>Create New Patient</h1>
<br />
<div class="col-sm-4">
<form action="#" th:action="@{/save}" th:object="${patient}" method="post">

<div alight="left">
<tr>
<label class="form-label" > Patient Name</label>
<td>
<input type="hidden" th:field="*{id}" />
<input type="text" th:field="*{patientname}" class="form-control" placeholder= Patient Name" />
</td>
</tr>
</div>

<div alight="left">

<tr>
<label class="form-label" >PatientAge</label>
<td><input type="text" th:field="*{patientage}" class="form-control" placeholder= Patient Age" />
</tr>
</div>
<div alight="left">
<tr>
<label class="form-label" >VaccineType</label>
<td><input type="text" th:field="*{vaccinetype}" class="form-control" placeholder= Vaccine Type" />
</tr>
</div>
<br> 
<tr>
<td colspan="2"><button type="submit" class="btn btn-info">Save</button> </td>
</tr>
</table>
</form>
</div>
