<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Beeant
  Date: 2016/3/13
  Time: 13:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<c:set value="<%=request.getContextPath()%>" var="ctp" />
<c:set value="${ctp}/static/assets" var="assets" />
<c:set value="${assets}/datatables" var="table" />

<link rel="stylesheet" type="text/css" href="${table}/datatables.min.css"/>

<script type="text/javascript" src="${table}/datatables.min.js"></script>

<script>
    $.fn.dataTable.ext.errMode = "none";

    $('table').on('preXhr.dt', function ( e, settings, data ) {
        data.search = '';
    }).on('xhr.dt', function ( e, settings, json, xhr ) {
        if(json.dataTables != undefined){
            var table = json.dataTables;
            for(var x in table){
                json[x] = table[x];
            }
            delete json.dataTables;
        }
    } )
</script>