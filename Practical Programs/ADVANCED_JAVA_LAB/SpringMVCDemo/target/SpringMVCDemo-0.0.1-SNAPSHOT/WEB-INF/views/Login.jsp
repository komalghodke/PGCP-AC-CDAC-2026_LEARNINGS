<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>${message}</h3>

      <form action="login/validate" method="post">
      Username: <input type="text" name="uname" id="unm"><br/>
      Password: <input type="password" name="pass" id="passwd"><br/>
      <button type="submit" name="btn" id="btn">Login</button>
      </form>
</body>
</html>