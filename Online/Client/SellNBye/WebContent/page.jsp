<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
  <h2>Product form</h2>
  <form id="myform" action="/action_page.php">
    <div class="form-group">
      <label for="email">productid:</label>
      <input type="text" class="form-control" id="txtProID" name="txtProID">
    </div>
    <div class="form-group">
      <label for="pwd">productname:</label>
      <input type="text" class="form-control" id="txtProName" name="txtProName">
    </div>
    <div class="form-group">
      <label for="pwd">Description:</label>
      <input type="text" class="form-control" id="txtProDesc"  name="txtProDesc">
    </div>
    <div class="form-group">
      <label for="pwd">price:</label>
      <input type="text" class="form-control" id="txtProPrice"  name="txtProDesc">
    </div>
    <button type="submit" class="btn btn-default" value="Validate!">Submit</button>
  </form>
</div>


<div class="container text-center" id="tasksDiv">
		<h3>Customer Table</h3>
		<hr>
		<div class="table-responsive">
			<table class="table table-striped table-bordered">
				<thead>
					<tr>
						<th>ProductID</th>
						<th>Product Name</th>
						<th>Description</th>
						<th>Price</th>
					</tr>
				</thead>
				<tbody>
						<tr>
							<td>${Product.id}</td>
							<td>${Product.name}</td>
							<td>${Product.description}</td>
							<td>${Product.price}</td>
							<td><a href="/delete-customer?id=${Product.id }"><span
									class="glyphicon glyphicon-trash"></span></a></td>
							<td><a href="/edit-customer?id=${Product.id }"><span
									class="glyphicon glyphicon-pencil"></span></a></td>
						</tr>
				</tbody>
			</table>
		</div>
	</div>


</body>
</html>