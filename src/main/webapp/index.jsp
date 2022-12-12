<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">

    <title>My JSP 'error.jsp' starting page</title>

    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
    <!--
    <link rel="stylesheet" type="text/css" href="styles.css">
    -->
    <script type="text/javascript"src="<%=basePath%>js/jquery-1.8.3.min.js"charset="UTF-8"></script>
    <script type="text/javascript">
        function submitUserData(){
            $.post("vaildateUserControl/addUser1",
                {
                    username:$("#username").val(),
                    password:$("#password").val()
                },
                backData
            );
        }
        function backData(jsonStr){
            alert(jsonStr);
        }
    </script>
</head>

<body>
    <form action="addUser" method="post">
        用户名:<input type="text" name="username" id="username"><br>
        密码:<input type="password" name="password" id="password"><br>

        sex:<input type="radio" name="sex" value="男" />男
            <input type="radio" name="sex" value="女" />女
        <input type="submit" value="提交">
    </form>
</body>
</html>