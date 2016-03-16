<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:set value="<%=request.getContextPath()%>" var="ctp"/>
<c:set value="${ctp}/static" var="resources"/>
<c:set value="${ctp}/static/assets" var="assets"/>
<!DOCTYPE html>
<html lang="zh-CN" class="vertical-centered">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
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
</head>
<body class="no-padding">
<div class="container">
    <div class="row">
        <div id="content-flash">
            <form action="${ctp}/app/login?action=login" method="post" role="form" class="form-horizontal form-login">
                <legend class="text-center">Login Logo</legend>

                <div class="form-group">
                    <label for="login-username" class="col-sm-2 control-label">Username</label>
                    <div class="col-sm-10">
                        <input type="text" name="username" class="form-control" id="login-username"
                               placeholder="username"
                               value="${user.username}"/>
                    </div>
                </div>
                <c:if test="${username != null}">
                    <div class="form-group">
                        <label class="col-sm-2 control-label"></label>
                        <div class="col-sm-10">
                            <p class="form-control-static text-danger">${username}</p>
                        </div>
                    </div>
                </c:if>

                <div class="form-group">
                    <label for="login-password" class="col-sm-2 control-label">Password</label>
                    <div class="col-sm-10">
                        <input type="password" name="password" class="form-control" id="login-password"
                               placeholder="password"
                               value="${user.password}"/>
                    </div>
                </div>
                <c:if test="${password != null}">
                    <div class="form-group">
                        <label class="col-sm-2 control-label"></label>
                        <div class="col-sm-10">
                            <p class="form-control-static text-danger">${password}</p>
                        </div>
                    </div>
                </c:if>

                <div class="checkbox form-group">
                    <label class="col-sm-2"> </label>
                    <label class="col-sm-10">
                        <input type="checkbox" name="rememberMe"> Remember me
                    </label>
                </div>
                <button type="submit" class="btn btn-default col-sm-offset-2">Submit</button>

            </form>
        </div>
    </div>

</div>
<script src="${assets}/bootstrap/3.3.5/js/bootstrap.js"></script>
<script src="${resources}/js/app.js"></script>
</body>
</html>
