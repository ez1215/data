<html>
<head>
    <title>用户列表</title>
</head>
<body>
<table border="1px">
    <tr>
        <th>序号</th>
        <th>用户名</th>
        <th>年龄</th>
        <th>生日</th>
        <th>邮箱</th>
        <th>密码</th>
        <th>头像</th>
        <th>昵称</th>
        <th>QQ</th>
    </tr>
    <#if userList??>
        <#list userList as user>
            <tr>
                <td>${user.id}</td>
                <td>${user.name}</td>
                <td>${user.age}</td>
                <td>${user.birth}</td>
                <td>${user.email}</td>
                <td>${user.passWord}</td>
                <td>${user.avator}</td>
                <td>${user.nickName}</td>
                <td>${user.qq}</td>
            </tr>
        </#list>
    </#if>
</table>
</body>
</html>
