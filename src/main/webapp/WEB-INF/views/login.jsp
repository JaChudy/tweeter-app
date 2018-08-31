<%--
  Created by IntelliJ IDEA.
  User: kuba
  Date: 31.08.18
  Time: 13:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Logowanie</title>
    <style>
        div {
            margin 5px
        }
    </style>
</head>
<body>
<div>
    <form method="post" action="/login">
        <fieldset>
        <legend> Podaj dane logowania</legend>
            <div>
                <input type="text" name="username" placeholder="Podaj login"/>
            </div>
            <div>
                <input type="password" name="password" placeholder="Podaj hasło"/>
            </div>
        </fieldset>
        <fieldset>
            <input type="submit" value="Zaloguj"/>
        </fieldset>
    </form>
</div>

</body>
</html>
