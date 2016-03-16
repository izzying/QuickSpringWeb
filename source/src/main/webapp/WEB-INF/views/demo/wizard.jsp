<%--
  Created by IntelliJ IDEA.
  User: Beeant
  Date: 2016/3/13
  Time: 14:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Wizard</title>
</head>
<body>
<div id="wizard" class="wizard">
    <!-- TAB NAVIGATION -->
    <ul class="nav nav-tabs" role="tablist">
        <li class="active"><a href="#tab1" role="tab" >Tab1</a></li>
        <li><a href="#tab2" role="tab" >Tab2</a></li>
        <li><a href="#tab3" role="tab" >Tab3</a></li>
    </ul>
    <!-- TAB CONTENT -->
    <div class="tab-content">
        <div class="active tab-pane fade in" id="tab1">
            <h2>Tab1</h2>
            <p>Lorem ipsum.</p>
        </div>
        <div class="tab-pane fade" id="tab2">
            <h2>Tab2</h2>
            <p>Lorem ipsum.</p>
        </div>
        <div class="tab-pane fade" id="tab3">
            <h2>Tab3</h2>
            <p>Lorem ipsum.</p>
        </div>
    </div>
    <div>
        <a id="pre">pre</a>
        <a id="next">next</a>
    </div>
</div>

<jsp:include page="../common/assets/wizard.jsp" />
<script>

    var wizard = $('#wizard').wizard({
        clickableTab:true
    });
    $('#next').click(function(){
        $('#wizard').wizard('next');
    })
</script>

</body>
</html>
