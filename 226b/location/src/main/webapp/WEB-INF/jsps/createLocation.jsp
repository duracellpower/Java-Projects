<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>

    <form action="saveLoc" method="post">
        <pre>
            Id: <input type="text" name="id">
            Code: <input type="text" name="code">
            Name: <input type="text" name="name">
            Type: Urban <input type="radio" name="type" value="URBAN">
                  Rural <input type="radio" name="type" value="RURAL">
            <input type="submit" value="save">
        </pre>

    </form>
    ${msg}

</body>
</html>



