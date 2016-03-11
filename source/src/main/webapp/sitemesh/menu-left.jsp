<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:set value="<%=request.getContextPath()%>" var="ctp"/>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <title>
        <sitemesh:write property='title'/>
    </title>
    <sitemesh:write property='head'/>
</head>

<body>
<div id="nav-side" class="navbar-default">
    <div class="nav-collapse " tabindex="5000" style="overflow: hidden; outline: none;">
        <div class="tab-content">
            <ul role="tabpanel" class="tab-pane nav nav-collapse active" id="menu-home">
                <li><a href="${ctp}/appUser/browse">AppUser Browse</a></li>
                <li><a href="#">Menu2</a></li>
                <li><a href="#">Menu3</a></li>
            </ul>
            <ul role="tabpanel" class="tab-pane nav nav-collapse" id="menu-tab2">
                <li><a href="#">Tab Menu1</a></li>
                <li><a href="#">Tab Menu2</a></li>
                <li><a href="#">Tab Menu3</a></li>
            </ul>
        </div>
    </div>
</div>
<div id="content-main">
    <sitemesh:write property='body'/>
</div>

<sitemesh:write property="footer"/>

</body>
</html>
</body>
