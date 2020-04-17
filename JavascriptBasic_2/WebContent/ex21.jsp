<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	
<script type='text/javascript'>

	var numArr = [];
	
	var nList = new Array();
	
	for (var i = 0; i < 100; i++) {
		numArr[i] = (i + 1);
		if (numArr[i] % 10 == 0) {
			document.write(numArr[i] + '<br/>');
		} else {
			document.write(numArr[i] + ' ');
		}
	}
	
	

</script>

</head>

<body>

	
	
</body>
</html>