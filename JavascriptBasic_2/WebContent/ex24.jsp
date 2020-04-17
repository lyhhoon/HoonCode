<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
   <meta charset="UTF-8">
   <title>Insert title here</title>
   
<script type="text/javascript">

	function spaceFnc(spaceNum) {
	    var spaceStr = '';
	    
	    for (var i = 0; i < spaceNum; i++) {
	       spaceStr = spaceStr + '&nbsp;';
	    }
	    
	    return spaceStr;
	 }

	/* 2차원 배열 */
	var numArr = new Array();
	
	numArr[0] = new Array();
	
	for (var i = 0; i < numArr.length; i++) {
		for (var n = 0; n < 3; n++) {
			numArr[i][n] = '' + i + ', ' + n + spaceFnc(2);
		}
	}
	
	for (var i = 0; i < numArr.length; i++) {
		for (var n = 0; n < numArr[i].length; n++) {
			document.write(numArr[i][n]);
		}
	}
	
	
	
</script>

</head>

<body>

   
   
</body>
</html>