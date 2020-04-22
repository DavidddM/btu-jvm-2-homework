<%--
  Created by IntelliJ IDEA.
  User: david
  Date: 25.03.20
  Time: 20:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>შინაური ცხოველების სარეგისტრაციო ფორმა</title>
</head>
<body>
    <form id="animalForm" action="animalservlet" method="post">
        <label>სახელი</label><input name="name"/>
        <br/>
        <label>ჯიში</label><input name="breed"/>
        <br/>
        <label>სქესი</label><input name="sex"/>
        <br/>
        <label>ასაკი</label><input name="age"/>
        <br/>
        <input type="submit"/>
    </form>
</body>
</html>
