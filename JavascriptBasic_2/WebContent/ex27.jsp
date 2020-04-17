<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	
<script type='text/javascript'>

	var teamInfo = new Array();
	
	var info = '';
	
	var name = '';
	var age = '';
	var grade = '';
	
	name = '이름 : ';
	age = '나이 : ';
	
	teamInfo[0] = {
			name : name + '윤형식',
			age : age + 32,
			grade : '팀장'
	}
	
	teamInfo[1] = {
			name : name + '박지훈',
			age : age + 28,
			grade : '팀원'
	}
	
	teamInfo[2] = {
			name : name + '이용훈',
			age : age + 26,
			grade : '팀원'
	}
	
	for (var i = 0; i < teamInfo.length; i++) {
		info += (teamInfo[i].name + '<br/>' + teamInfo[i].age + '<br/>'
			+ teamInfo[i].grade + '<br/>' + '<br/>');
	}
	
	document.write(info);
		
</script>

</head>

<body>

	
	
</body>
</html>