<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  User: Beeant
  Date: 2016/3/4
  Time: 18:38
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:set var="ctp" value="<%=request.getContextPath()%>"/>

<html>
<head>
    <title>Login</title>
</head>
<body>
<form action="${ctp}/app/login?action=login" method="post" role="form" class="form-horizontal">
    <legend class="text-center">Login Logo</legend>

    <div class="form-group">
        <label for="login-username" class="col-sm-2 control-label">Username</label>
        <div class="col-sm-10">
            <input type="text" name="username" class="form-control" id="login-username" placeholder="username"
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
            <input type="password" name="password" class="form-control" id="login-password" placeholder="password"
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
            <input type="checkbox" name="rememberMe"> 保持登录
        </label>
    </div>

    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
            <button type="submit" class="btn btn-default">Submit</button>
        </div>
    </div>

</form>
</body>
</html>
