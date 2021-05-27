<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Trade Publisher UI</title>
</head>
<body>

	<H1>Home Page</H1>
	<H2>Trade Data Input</H2>
	<br/><br/>
	<form action="publishTrade">
	<input type="Submit" ><br>
	<H3>Trade Details Form</H3>
	Trade ID             : <input type="text" name="tradeID" value=${Trade.tradeID}><br> 
	Trade Format         : <input type="text" name="tradeFormat"><br>
	Source Currency      : <input type="text" name="tradeSourceCurrency" ><br>
	Destination Currency : <input type="text" name="tradeDestinationCurrency" ><br>
	Trade Value          : <input type="text" name="tradeSourceValue" ><br>
	</form>
	<br/><br/>
	</body>
</html>