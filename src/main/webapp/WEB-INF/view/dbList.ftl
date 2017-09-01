<html>
<head>
    <title>数据库列表</title>
</head>
<style type="text/css">

</style>
<script src="https://cdn.bootcss.com/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript">
    function changeDb() {
        var _sel = document.getElementById("db_sel");
        var _index = _sel.selectedIndex;
        var _db_id = _sel.options[_index].value;
        window.location.href="/dbList?dbId="+_db_id;
    }
</script>
<body>
<table border="1px">
    <tr>
        <th>序号</th>
        <th>url</th>
        <th>用户</th>
        <th>密码</th>
        <th>数据库名</th>
    </tr>
    <#if list??>
        <#list list as list>
        <tr>
            <td>${list.id}</td>
            <td>${list.url}</td>
            <td>${list.userName}</td>
            <td>${list.passWord}</td>
            <td>${list.dbName}</td>
        </tr>
        </#list>
    </#if>
</table>
<br>
<select id="db_sel" onchange="changeDb()">
<#if list??>
    <#list list as list>
        <option value="${list.id}">数据库${list.id}</option>
    </#list>
</#if>
    <option value=""></option>
    <option value=""></option>
    <option value=""></option>
</select>
<br>
<br>
<h1>用户列表</h1>
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
