<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">

    <title>Watershed UGA Data Management Portal</title>

    <!-- Bootstrap core CSS -->
    <link href="bootstrap.min.css" rel="stylesheet">

    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <link href="../../assets/css/ie10-viewport-bug-workaround.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="stylesheet.css" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="../../assets/js/ie-emulation-modes-warning.js"></script>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>

  <body>
  <div id="navbar">
  <div id="custom-bootstrap-menu" class="navbar navbar-default " role="navigation">
    <div class="container-fluid">
        <div class="navbar-header"><a class="navbar-brand" href="#">Watershed UGA Data Management</a>
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-menubuilder"><span class="sr-only">Toggle navigation</span><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span>
            </button>
        </div>
        <div class="collapse navbar-collapse navbar-menubuilder">
            <ul class="nav navbar-nav navbar-left">
                <li><a href="/">Home</a>
                </li>
                <li><a href="/products">View Data</a>
                </li>
                <li><a href="https://watershed.uga.edu/">Watershed UGA</a>
                </li>
                <li><a href="/about-us">Login</a>
                </li>
            </ul>
        </div>
    </div>
 </div>
 </div>
 <div class="header-image">
	<p><img src="trailcreek.jpg" width="100%" height="auto"></p>
 </div>
</div>

    <div class="container">

      <div id="heading" class="page">
        <h1> Add Data </h1>
        <p>Faculty, staff and students have been collecting data on UGA's streams.Please use the below form to enter data to the database
         </p><br>
      </div>
      
     <div class ="form">

<form  name=addForm action=adddata method=get>

<label> Sample Date :</label>
<input type = text name = date value=""/>
<br/>


<label> Sampled By :</label>
<input type = text name = sampledby value=""/>
<br/>

<label> Site Condition :</label>
<input type = text name =sitecondition value=""/>
<br/>

<label> Ph :</label>
<input type = text name =ph value=""/>
<br/>

<label> Conductivity :</label>
<input type = text name =conductivity value=""/>
<br/>

<label> Dissolved Oxygen :</label>
<input type = text name =dissolvedoxygen value=""/>
<br/>

<label> Temperature:</label>
<input type = text name =temperature value=""/>
<br/>

<label> TURBIDITY :</label>
<input type = text name =turbidity value=""/>
<br/>

<label> STAGE :</label>
<input type = text name =stage value=""/>
<br/>

<label> FECAL COLIFORM :</label>
<input type = text name =fecalcoliform value=""/>
<br/>

<label> ECOLI :</label>
<input type = text name =ecoli value=""/>
<br/>

<label> HARDNESS :</label>
<input type = text name =hardness value=""/>
<br/>

<label> TOTAL-P :</label>
<input type = text name =totalp value=""/>
<br/>

<label> TOTAL-N:</label>
<input type = text name =totaln value=""/>
<br/>

<label> TSS :</label>
<input type = text name =tss value=""/>
<br/>

<label> ARSENIC :</label>
<input type = text name =arsenic value=""/>
<br/>

<label> COPPER :</label>
<input type = text name =copper value=""/>
<br/>

<label> Lead :</label>
<input type = text name =lead value=""/>
<br/>

<label> Zinc :</label>
<input type = text name =zinc value=""/>
<br/>


<label> Site Name :</label>
	<select name="Site Name">
    <option value="Tanyard Creek">Tanyard Creek</option>
    <option value="Cloverhurst Branch">Cloverhurst Branch</option>
  </select>
<br/>

<label> Site Point :</label>
	<select name="Site Point">
    <option value="MP-1">MP-1</option>
    <option value="MP-3">MP-3</option>
    <option value="MP-6">MP-6</option>
  </select>
<br/>

<input type =submit name =submit value="Add Data"/>
</form>

     
     

    </div><!-- /.container -->
    
   <div id="veiw">
				<input class ="button" type="button" value="View Data">
				<input class ="button" type="button" value="Watershed UGA HomePage">
				</div>
				<div id="login">
				<br><input class ="button" type="button" value="Login"><br>
				</div>
			
	</div><!-- /end .section.body -->
	
	<div class="footer">
		<p>Watershed UGA 2017 <br><img src="georgia.png" alt="" width="70px" height="auto" /> </br></p>
		
	</div>	


    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>
    <script src="../../dist/js/bootstrap.min.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
    <!--Included to ensure the mobile drop down menu works properly -->
    <script src="http://code.jquery.com/jquery-latest.min.js"></script> 
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
  </body>
</html>
</head>