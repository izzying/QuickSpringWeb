<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:set value="<%=request.getContextPath()%>" var="ctp"/>
<c:set value="${ctp}/static" var="resources"/>
<c:set value="${ctp}/static/assets" var="assets"/>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title><sitemesh:write property='title'/></title>
    <!-- Bootstrap -->
    <link href="${assets}/bootstrap/3.3.5/css/bootstrap.css" rel="stylesheet">
    <link href="${assets}/bootstrap/3.3.5/css/bootstrap-theme.css" rel="stylesheet">
    <link href="${assets}/font-awesome/4.5.0/css/font-awesome.css" rel="stylesheet">

    <link href="${resources}/css/style.css" rel="stylesheet">
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="${assets}/jquery/1.12.1/jquery.min.js"></script>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="${assets}/html5shiv/3.7.3/html5shiv-printshiv.js"></script>
    <script src="${assets}/respond/1.4.2/respond.js"></script>
    <![endif]-->
    <sitemesh:write property='head'/>
</head>
<body>
<div class="container">
    <div class="row">
        <div id="content-flash">
            <sitemesh:write property='body'/>
        </div>
    </div>

    </div>
</div>
<sitemesh:write property="footer" />
<script src="${assets}/bootstrap/3.3.5/js/bootstrap.js"></script>
<script src="${resources}/js/app.js"></script>
</body>
</html>
