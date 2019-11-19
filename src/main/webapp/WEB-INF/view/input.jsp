<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<html>
    <body>
        ${param.title}
        <form action="greeting" method="GET">
            <input type="text" name="nameParam" placeholder="What is your group name?"/>
            <input type="Submit"/>
        </form>
    </body>
</html>