<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/resources/css/bootstrap.min.css">
    <script src="/resources/js/bootstrap.min.js"></script>
</head>
<body>
<div class="jumbotron vertical-center">
    <form:form method="post" action="edit?id=${editedPost.id}" commandName="editedPost">
        <div class="container">
            <label for="title-input" class="col-md-1 col-form-label">Title:</label>
            <div class="col-md-11">
                <form:input path="title" class="form-control" value="Title" id="title-input"/>
            </div>
            <label for="text-input" class="col-md-1 col-form-label">Text:</label>
            <div class="col-md-11">
                <form:textarea path="text" class="form-control" wrap='off' rows="20" cols="200" id="text-input"/>
            </div>
            <label class="col-md-1 col-form-label"></label>
            <div class="col-md-11">
                <input type="submit" class="btn btn-primary">
                <a href="/index"><input type="button" value="Cansel" class="btn btn-primary"></a>
            </div>
        </div>
    </form:form>
</div>
</body>
</html>
