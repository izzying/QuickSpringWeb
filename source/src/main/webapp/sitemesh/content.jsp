<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:set value="<%=request.getContextPath()%>" var="ctp"/>
<c:set value="${ctp}/static" var="resources"/>
<c:set value="${ctp}/static/assets" var="assets"/>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <title>
        <sitemesh:write property='title'/> - 车联网客服系统
    </title>
    <sitemesh:write property='head'/>
</head>
<body>
<ol class="breadcrumb">
    当前位置:
    <c:forEach items="${positions}" var="item">
        <c:choose>
            <c:when test="${item.url == ''}">
                <li>${item.name}</li>
            </c:when>
            <c:when test="${item.url == '#'}">
                <li><a href="#"> ${item.name}</a></li>
            </c:when>
            <c:otherwise>
                <li><a href="<%=request.getContextPath()%>${item.url}"> ${item.name} </a></li>
            </c:otherwise>
        </c:choose>
    </c:forEach>
</ol>
<sitemesh:write property='body'/>
<sitemesh:write property="footer"/>
</body>
</html>
