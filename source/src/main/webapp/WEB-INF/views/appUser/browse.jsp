<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Beeant
  Date: 2016/3/8
  Time: 14:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:set value="<%=request.getContextPath()%>" var="ctp"/>
<html>
<head>
    <title>Browse</title>
</head>
<body>
<div id="content-body">
    <div class="table-responsive">
        <table id="table" class="table table-hover">
            <thead>
            <tr>
                <th>Check</th>
                <th>Actions</th>
                <th>Name</th>
                <th>Gender</th>
                <th>Status</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td></td>
            </tr>
            </tbody>
        </table>
    </div>
</div>
<jsp:include page="../common/assets/table.jsp"/>
<script>
    $("#table").DataTable({
        serverSide: true,
        ajax: {
            url: '${ctp}/appUser/browse',
            data: {media: 'json'}
        },
        columns: [
            {data: ''},
            {data: ''},
            {data: 'userName'},
            {
                "data": function (row, type, val, meta) {
                    console.log('x');
                    return gender[row.gender];
                }
            },
            {
                data: function (row, type, val, meta) {
                    console.log('y');
                    return status[row.status];
                }
            }
        ]
    });
</script>
</body>
</html>
