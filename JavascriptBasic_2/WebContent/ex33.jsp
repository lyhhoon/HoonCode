<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	
<script type='text/javascript'>

	var num = '     2    ';
	var num2 = '   100 ';
	var sum = '';
	
	/* sum = Number(num) + Number(num2); */
	
	sum = Number(num.trim()) + Number(num2.trim());
	
	alert(sum);
	

	function masterGugudanFnc(dan) {
		
		/* dan *= 1; */
		
		/* dan = dan + 100; */
		dan = Number(dan) + 100;
		alert(dan);
	}

</script>

</head>

<body>

	<input type="button" onclick="masterGugudanFnc('     2     ');" value='2단'>
	<input type="button" onclick="masterGugudanFnc('3');" value='3단'>
	<input type="button" onclick="masterGugudanFnc('4');" value='4단'>
	<input type="button" onclick="masterGugudanFnc('10단');" value='10단'>
	<input type="button" onclick="masterGugudanFnc('11단');" value='11단'>
	
</body>
</html>