<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet"
      href="./css/Stylesheet.css"
      type="text/css"/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Grocery Database - Add a Product</title>
</head>
<body>

		<div id="header">
			    <div id="header-left">
					<h4>Glen C. Falk</h4>
    			</div>
    			<div id="header-middle">
					<h4>MIST7510</h4>
    			</div>
    			<div id="header-right">
					<h4>Assignment 10</h4>
    			</div>
		</div>
		
		<div id="nav">
			<h4>Grocery Db</h4>
			<a href="index.jsp"><button type="button" id="buttonNav">Home</button></a>
			<input type="button" id="buttonNav" value="Back"  onClick="history.go(-1);return true;"> 
		</div>
		
		<div id="section">
			<form name=addForm action=addProduct method=post>
			
			<br><br>
				<fieldset>	
				<legend>Add Product Information</legend>							
						<label>SKU:</label>
						<input type=text name=sku required value="" /><br>
						
						<label>Product Type:</label>
						<input type=text name=productType value="" /> <br>
						
						<label>Flavor:</label>
						<input type=text name=flavor value="" /><br>
						
						<label>Cost:</label>
						<input type=text name=cost value="" /><br>
						
						<label>Price:</label>
						<input type=text name=price value="" /><br>
						
						<label>Quantity:</label>
						<input type=text name=quantity value="" /><br>
						
						<input type=submit name=submit id="button" value="Add">
						<input type=reset name=reset id="reset">	
					</fieldset>
			</form>
		</div>
		
		<div id="footer">
			<p>The University of Georgia Master of Internet Technology Program</p>
		</div>
</body>
</html>