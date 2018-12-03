<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>


<html>
<head>
<title>Home_dto_select</title>
</head>
<body>
    <h1>STS DB DTO Insert</h1>
 
 <form action ="/springTest/homeDtoInsert" method="post">
               ID:<input type="text" name="id"><br>
               PW:<input type="text" name="pw"><br>
               NAME:<input type="text" name="name"><br>
               <button>전송</button>

 </form>
 
 <b>DB에 ${insertDBSuccess} 성공하였습니다. (1이면 성공 그외는 실패)</b>
 
 
</body>
</html>


