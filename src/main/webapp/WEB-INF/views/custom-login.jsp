<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<title>GFG Login Page</title>
<body bgcolor="green">
  <h1>Login Page</h1>

<form action="${pageContext.request.contextPath}/process-login" method="post">
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
    Username: <input type="text" name="username"><br>
    Password: <input type="password" name="password"><br>
    <input type="submit" value="Login">
</form>