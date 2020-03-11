<!DOCTYPE html>
<html lang = "en">
<head>
	<meta charset = "UTF-8">
	<title>Employee homepage</title>
	<link rel="icon" 
      type="image/png" 
      href="toadMK.png">
	<link rel = "stylesheet" href = "style.css">
	<!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

</head>
<body>
	
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <a style="color:white;" id="welcome" class="navbar-brand">Welcome back</a>
        
        <button style="position:absolute;right:20px;" class="btn btn-outline-danger" type="button">log out</button>
	</nav>
	
	
	<div style = "margin-top: 6%;"></div>
	<div class = "container-fluid">
		<div class = "row align-items-start">
			<div class = "col-md-3">
				
			</div>
			<div class="col-md-6">
				<h1 style="text-align:center;">Your reimbursement request history:</h1>
				<br />
				
				<form id="login" name="login" action="RF" method="GET">
					<input type="submit" value="Submit">
				</form>
				
				<table class="table">
					<thead>
						<tr><strong>
							<th>Date</th>
							<th>Amount</th>
							<th>Description</th>
							<th>Status</th>
						</strong></tr>
					</thead>
					<tbody>
						<tr>
							<td>08MAR2020</td>
							<td>$2500.00</td>
							<td>org.apache.coyote.AbstractProtocol start INFO: Starting ProtocolHandler ["http-nio-8080"] Mar 08, 2020 2:29:57 PM org.apache.catalina.startup.Catalina start INFO: Server startup in [2,200] milliseconds</td>
							<td>pending</td>
						</tr>      
						<tr class="table-primary">
							<td>08MAR2020</td>
							<td>$2500.00</td>
							<td>org.apache.coyote.AbstractProtocol start INFO: Starting ProtocolHandler ["http-nio-8080"] Mar 08, 2020 2:29:57 PM org.apache.catalina.startup.Catalina start INFO: Server startup in [2,200] milliseconds</td>
							<td>pending</td>
						</tr>
						<tr class="table-success">
							<td>08MAR2020</td>
							<td>$2500.00</td>
							<td>org.apache.coyote.AbstractProtocol start INFO: Starting ProtocolHandler ["http-nio-8080"] Mar 08, 2020 2:29:57 PM org.apache.catalina.startup.Catalina start INFO: Server startup in [2,200] milliseconds</td>
							<td>pending</td>
						</tr>
						<tr class="table-danger">
							<td>08MAR2020</td>
							<td>$2500.00</td>
							<td>org.apache.coyote.AbstractProtocol start INFO: Starting ProtocolHandler ["http-nio-8080"] Mar 08, 2020 2:29:57 PM org.apache.catalina.startup.Catalina start INFO: Server startup in [2,200] milliseconds</td>
							<td>pending</td>
						</tr>
						<tr class="table-info">
							<td>08MAR2020</td>
							<td>$2500.00</td>
							<td>org.apache.coyote.AbstractProtocol start INFO: Starting ProtocolHandler ["http-nio-8080"] Mar 08, 2020 2:29:57 PM org.apache.catalina.startup.Catalina start INFO: Server startup in [2,200] milliseconds</td>
							<td>pending</td>
						</tr>
						<tr class="table-warning">
							<td>08MAR2020</td>
							<td>$2500.00</td>
							<td>org.apache.coyote.AbstractProtocol start INFO: Starting ProtocolHandler ["http-nio-8080"] Mar 08, 2020 2:29:57 PM org.apache.catalina.startup.Catalina start INFO: Server startup in [2,200] milliseconds</td>
							<td>pending</td>
						</tr>
						<tr class="table-active">
							<td>08MAR2020</td>
							<td>$2500.00</td>
							<td>org.apache.coyote.AbstractProtocol start INFO: Starting ProtocolHandler ["http-nio-8080"] Mar 08, 2020 2:29:57 PM org.apache.catalina.startup.Catalina start INFO: Server startup in [2,200] milliseconds</td>
							<td>pending</td>
						</tr>
						<tr class="table-secondary">
							<td>08MAR2020</td>
							<td>$2500.00</td>
							<td>org.apache.coyote.AbstractProtocol start INFO: Starting ProtocolHandler ["http-nio-8080"] Mar 08, 2020 2:29:57 PM org.apache.catalina.startup.Catalina start INFO: Server startup in [2,200] milliseconds</td>
							<td>pending</td>
						</tr>
						<tr class="table-light">
							<td>08MAR2020</td>
							<td>$2500.00</td>
							<td>org.apache.coyote.AbstractProtocol start INFO: Starting ProtocolHandler ["http-nio-8080"] Mar 08, 2020 2:29:57 PM org.apache.catalina.startup.Catalina start INFO: Server startup in [2,200] milliseconds</td>
							<td>pending</td>
						</tr>
						<tr class="table-dark text-dark">
							<td>08MAR2020</td>
							<td>$2500.00</td>
							<td>org.apache.coyote.AbstractProtocol start INFO: Starting ProtocolHandler ["http-nio-8080"] Mar 08, 2020 2:29:57 PM org.apache.catalina.startup.Catalina start INFO: Server startup in [2,200] milliseconds</td>
							<td>pending</td>
						</tr>
					</tbody>
				</table><br />

				
				<!-- 'ADD REQUEST' FORM -->
				<form style="margin-bottom:20%;">
					<div class="form-group row">
						&emsp;&emsp;
						<p><script> document.write(new Date().toLocaleDateString()); </script></p>
						&emsp;
						<div class="col-xs-2">
							<input type="text" class="form-control" placeholder="$ amount">
						</div>
						&emsp;
						<div class="col-xs-4">
							<input type="text" class="form-control" placeholder="description">
						</div>
					</div>
					<input type="submit" value="Add Request">
				</form>
				<!-- END OF 'ADD REQUEST' FORM -->
			
			</div>
			<div class = "col-md-3">
				
			</div>
		</div>
	</div>
</body>
</html>