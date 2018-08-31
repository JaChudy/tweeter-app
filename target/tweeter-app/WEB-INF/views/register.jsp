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
    <form method="post" action="/register">
        <fieldset>
            <legend>Podaj dane uzytkownika</legend>
        </fieldset>
        <div>
            <input type="text" name="username" placeholder="Podaj login"/>
        </div>
        <div>
            <input type="email" name="email" placeholder="Podaj email"/>
        </div>
        <div>
            <input type="password" name="password" placeholder="Podaj haslo"/>
        </div>
        <fieldset>
            <span>
                <input type="reset" value="Wyczyść"/>
            </span>
            <span>
                <input type="submit" value="Wyślij"/>
            </span>
        </fieldset>
    </form>

</div>

</body>
</html>
