<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>


<html>
<head>
	<title>doB</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  This is doB call... HomeController에서 리턴되는 String에 .jsp를 붙인 정보를 호출한다.( views폴더 바로 아래) </P>

<p> doB 실행 </p>

<h4>이름 : ${member.name }</h4>
<h4>성별 : ${member.sex }</h4>
<h4>나이 : ${member.age }</h4>
<h4>주소 : ${member.address }</h4>
<h4>전화 : ${member.phone }</h4>

<p>
--------------------------------------------------------------
<p>

${member }

</body>
</html>
