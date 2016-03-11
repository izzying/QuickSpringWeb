<%@ page import="com.beeant.dto.AppUser" %>
<%@ page import="org.apache.shiro.SecurityUtils" %>
<%@ page import="org.apache.shiro.session.Session" %>
<%@ page import="org.apache.shiro.subject.Subject" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:set value="<%=request.getContextPath()%>" var="ctp"/>
<c:set value="${ctp}/static" var="resources"/>
<c:set value="${ctp}/static/assets" var="assets"/>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <title>
        <sitemesh:write property='title'/> - EasySite
    </title>
    <sitemesh:write property='head'/>
</head>
<body>
<nav id="nav-top" class="navbar navbar-default navbar-static-top">
    <div class="container-fluid">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse"
                    data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#"><span class="logo-img"> </span>Brand</a>
        </div>

        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse">
            <ul class="nav navbar-nav" role="tablist" id="menu-top">
                <li class="active">
                    <a href="#menu-home" data-toggle="tab" role="tab" aria-controls="home">Home <span class="sr-only">(current)</span></a>
                </li>
                <li><a href="#menu-tab2" data-toggle="tab" role="tab" aria-controls="tab2">Tab 2</a></li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
                       aria-expanded="false">Dropdown <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="#">Action</a></li>
                        <li><a href="#">Another action</a></li>
                        <li><a href="#">Something else here</a></li>
                        <li role="separator" class="divider"></li>
                        <li><a href="#">Separated link</a></li>
                        <li role="separator" class="divider"></li>
                        <li><a href="#">One more separated link</a></li>
                    </ul>
                </li>
            </ul>
            <form class="navbar-form navbar-left" role="search">
                <div class="form-group">
                    <input type="text" class="form-control" placeholder="Search">
                </div>
                <button type="submit" class="btn btn-default">Submit</button>
            </form>
            <ul class="nav navbar-nav navbar-right">
                <li><a href="#">Link</a></li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
                       aria-expanded="false">
                        <%
                            Subject subject = SecurityUtils.getSubject();
                            Session userSession = subject.getSession();
                            AppUser account = new AppUser();
                            account.setUserFullname("游客");
                            try {
                                account = (AppUser) userSession.getAttribute("user");
                            } catch (Exception e) {

                            }
                        %>
                        <%=account.getUserFullname()%>
                        <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="#">Action</a></li>
                        <li><a href="#">Another action</a></li>
                        <li><a href="${ctp}/app/logout">Logout</a></li>
                        <li role="separator" class="divider"></li>
                        <li><a href="#">Separated link</a></li>
                    </ul>
                </li>
            </ul>
        </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
</nav>
<%--<div class="clearfix"></div>--%>
<div id="content">
    <sitemesh:write property='body'/>
</div>

<sitemesh:write property="footer"/>

</body>
</html>
</body>
