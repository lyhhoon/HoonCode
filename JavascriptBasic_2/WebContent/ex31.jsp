<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	
<script type='text/javascript'>

	var gugudanTotal = '';

	function masterGugudanFnc(dan) {
		
		num = dan.substring(0, dan.length - 1);
		
		gugudanTotal = '';
		
		for (var i = 1; i <= 9; i++) {
			gugudanTotal += (num + ' * ' + i + ' = ' + (num * i) + '\n');
		}
		alert(gugudanTotal);
	}

</script>

</head>

<body>

	<input type="button" onclick="masterGugudanFnc('2단');" value='2단'>
	<input type="button" onclick="masterGugudanFnc('3단');" value='3단'>
	<input type="button" onclick="masterGugudanFnc('4단');" value='4단'>
	<input type="button" onclick="masterGugudanFnc('10단');" value='10단'>
	<input type="button" onclick="masterGugudanFnc('11단');" value='11단'>
	
</body>
</html>