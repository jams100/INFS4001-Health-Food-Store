<%@page contentType="text/html" pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>

   <title>Login</title>
   </head>
   <body>
  <p>LOGIN</p>
	<div class="container" >

	<div class ="form-group form">
	<form action="login" method="post">
	<div>
	<label>
	Enter Username:
	</label>
	<input type="text" id="name" name="name" placeholder="name" class="form-control"/>
	<br>
	<label>
	Enter Password:
	</label>
	<input type="text" id="password" name="password" placeholder="password" class="form-control"/>
	</div>

	</div>
	<button id="loginButton" class="form-control">Login</button>
	</form>
	</div>

<br>
	<p>REGISTER</p>
		<div class="container2" >

	<div class ="form-group form2">
	<form action="register" method="post">
	<div>
	<label>
	Enter Userame:
	</label>
	<input type="text" id="name" name="name" placeholder="name" class="form-control2"/>
	<br>
	<label>
	Enter Password:
	</label>
	<input type="text" id="password" name="password" placeholder="password" class="form-control2"/>
	<br>
	<label>
	Enter Email
	</label>
	<input type="text" id="email" name="email" placeholder="email" class="form-control2"/>
	<br>
	<label>
	Enter Address
	</label>
	<input type="text" id="address" name="address" placeholder="address" class="form-control2"/>
	</div>
	<br>
	<label>
	Payment Method
	</label>
	<input type="text" id="payment" name="payment" placeholder="payment" class="form-control2"/>

	</div>
	<button id="RegisterButton" class="form-control2">Register</button>
	</form>

    </body> 
</html>