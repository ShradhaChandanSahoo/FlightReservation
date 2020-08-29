<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register User</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" 
      integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
      
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
</head>
<body>


	<form action="registerUser" method="post">
		<pre>
	     <h2>User Registration</h2>
	
		 <input type="text" name="firstName"  class="form-control" placeholder="FIRST NAME" id="ufirstname"/><span id="fmsg"></span>
		 <input type="text" name="lastName"  class="form-control" placeholder="LAST NAME"/>
		 <input type="text" name="email"  class="form-control" placeholder="EMAIL" id="uemail" /><span id="msg"></span>
		 <input type="password" name="password"  class="form-control" placeholder="PASSWORD"/>
		 <input type="password" name="confirmPassword"  class="form-control" placeholder="CONFIRM PASSWORD"/>
	    <input type="submit" value="Register" class="btn btn-primary" />
	</pre>
	</form>
	
	<script type="text/javascript">

		 $(document).ready(function(){

				$("#uemail").change(function(){

						$.ajax({

								url: 'valiadteEmail',
								data: {"uemail": $("#uemail").val() },
								success: function(result) {
									$("#msg").html(result);
									$("#msg").css("color","green")
								}
							});

					});

			}); 

		$(document).ready(function(){

			$("#ufirstname").change(function(){
				

				$.ajax({

						url:'validateFirstName',
						data: {"ufirstname": $("#ufirstname").val()},
						success: function(resultf) {

							$("#fmsg").html(resultf);
							$("#fmsg").css("color","red")
						}
					
					});	
				
				});

			});
	
	</script>

</body>
</html>