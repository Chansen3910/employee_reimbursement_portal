<!DOCTYPE html>
<html lang = "en">
<head>
	<meta charset = "UTF-8">
	<title>Welcome employees | Submit a reimbursement request</title>
	<link rel="icon" 
      type="image/png" 
      href="toadMK.png">
	<link rel = "stylesheet" href = "style.css">
	<!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
	
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <a style="color:white;" class="navbar-brand">Employee Reimbursement Portal</a>
	</nav>
	
	<div style = "margin-top: 10%;"></div>
	<div class = "container-fluid">
		<div class = "row align-items-start">
			<div class = "col-md-4">
				
			</div>
			<div class="col-md-4">
				
				<!-- Jumbotron that exists in the middle div (spans the 4th through the 8th columns of the bootstrap grid) -->
				<div class = "jumbotron">
				
					<!-- Text above horizontal rule -->
					<h3>Employee login</h3>
					<!-- Horizontal rule that spans 4 columns of the grid -->
					<hr class = "my-4">
					
					<!-- FORM -->
					<form id="login" name="login" action="FS" method="POST">
					
						Employee ID:
						<input type="text" class="form-control" id="inputEID" name="inputEID" placeholder="XXXXXXXX">
						Password:
						<input type="password" class="form-control" id="inputPass" name="inputPass" placeholder="password">
						
						<small class = "form-text text-muted">Never share your 8-digit employee ID with anyone.</small>
						<br />
						<input type="submit" value="Submit">
					
					</form>
					<!-- END OF FORM -->
					
				</div>
			</div>
			<div class = "col-md-4">
				
			</div>
		</div>
	</div>
</body>
</html>