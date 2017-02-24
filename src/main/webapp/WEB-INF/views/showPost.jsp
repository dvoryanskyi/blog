<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/resources/css/bootstrap.min.css">
    <script src="/resources/js/bootstrap.min.js"></script>
</head>
<body>
<div class="vertical-center text-center">
    <h2>${blog.title}</h2>
    <p>${blog.text}</p>
    <i>${blog.author}</i>
    <br>
    <a href="/">
        <button class="btn btn-primary">To main page</button>
    </a>
    <a href="/edit?id=${blog.id}">
        <button class="btn btn-primary">Edit</button>
    </a>
    <a href="/delete?id=${blog.id}">
        <button class="btn btn-primary">Delete</button>
    </a>
</div>
</body>
</html>
