<%@ page language="java" contentType="text/html; charset=utf8" pageEncoding="utf8" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>

<html>
<head>
    <link rel="stylesheet" href="/resources/css/bootstrap.min.css">
    <link rel="stylesheet" href="/resources/css/circlebtn.css">
    <script src="/resources/js/bootstrap.min.js"></script>
</head>
<body>
<nav class="navbar navbar-fixed-top navbar-inverse">
    <div class="navbar-inner">
        <div class="container">
            <a href="#" class="navbar-brand">My blog 1.0</a>

            <div class="btn-group-lg vertical-center pull-right">

                <a href="/show-table">
                    <button class="btn btn-success btn-circle btn-lg"><span class="glyphicon glyphicon-th-list"></span></button>
                </a>
                <a href="/add">
                    <button class="btn btn-info btn-circle btn-lg"><i class="glyphicon glyphicon-plus"></i></button>
                </a>


            </div>
        </div>
    </div>
    </div>
</nav>
<div class="container">
    <br><br>
    <div class="col-xs-6">
        <c:if test="${!empty blogList}">
            <c:forEach items="${blogList}" var="blog">
                <div>
                    <h2>${blog.title}</h2>
                    <p>${blog.text}</p>
                    <i>${blog.author}</i>
                    <br>
                    <a href="/showPost?id=${blog.id}"><button class="btn btn-primary btn-xs">Show</button></a>
                    <a href="/edit?id=${blog.id}"><button  class="btn btn-primary btn-xs">Edit</button></a>
                    <a href="/delete?id=${blog.id}"><button class="btn btn-primary btn-xs">Delete</button></a>
                </div>

            </c:forEach>
        </c:if>
    </div>

</div>
<script src="http://code.jquery.com/jquery-latest.js"></script>
</body>

</html>
