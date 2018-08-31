<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: kuba
  Date: 31.08.18
  Time: 13:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Rejestracja</title>
</head>
<body>
<div>
    <form:form method="post" modelAttribute="user">
        <fieldset>
            <legend>Podaj dane uzytkownika</legend>
        </fieldset>
        <div>
            Login <form:input path="username"/>
        </div>
        <div>
            Password <form:password path="password"/>
        </div>
        <div>
            Email: <form:input path="email"/>
        </div>
        <fieldset>
            <span>
                <input type="reset" value="Wyczyść"/>
            </span>
            <span>
                <input type="submit" value="Wyślij"/>
            </span>
        </fieldset>
    </form:form>

</div>

</body>
</html>
