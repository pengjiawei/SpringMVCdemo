<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: hasee
  Date: 2017/5/2
  Time: 9:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>bar/action1</title>
</head>
<body>

<form  name = "file" action="/upload" method="post"  enctype="multipart/form-data">
    <h1>使用spring mvc提供的类的方法上传文件</h1>
    选择号码文件:<input type="file" name="file">
    选择音频文件:<input type="file" name="file">
    <input type="submit" value="upload"/>
</form>

<%--<h1>File API Demo</h1>--%>
<%--<p>--%>
    <%--<!-- 用于文件上传的表单元素 -->--%>
<%--<form name="demoForm" id="demoForm" method="post" enctype="multipart/form-data"--%>
          <%--action="/bar/action1">--%>
<%--<p>Upload File: <input type="file" name="file" /></p>--%>
<%--<p><input type="submit" value="Submit" /></p>--%>
<%--</form>--%>
<%--<div>Progessing (in Bytes): <span id="bytesRead">--%>
 <%--</span> / <span id="bytesTotal"></span>--%>
<%--</div>--%>
<%--</p>--%>

</body>
</html>
