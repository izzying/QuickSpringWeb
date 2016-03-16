<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Beeant
  Date: 2016/3/16
  Time: 23:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:set value="<%=request.getContextPath()%>" var="ctp" />
<c:set value="${ctp}/static/assets" var="assets" />
<c:set value="${assets}/wizard" var="wizard" />

<link rel="stylesheet" type="text/css" href="${wizard}/wizard.css"/>

<script type="text/javascript" src="${wizard}/beeant.bootstrap.wizard.js"></script>
