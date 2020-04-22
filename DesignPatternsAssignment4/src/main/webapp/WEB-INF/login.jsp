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
     
    </body> 
</html>