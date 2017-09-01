<html>
<head>
    <title>数据库列表</title>
</head>
<style type="text/css">
    .table table tr{
        border:1px solid #F00;
    }
</style>
<body>
<div class="table">
<table>
    <thead>
        <th>序号</th>
        <th>url</th>
        <th>用户</th>
        <th>密码</th>
        <th>数据库名</th>
    </thead>
    <tbody>
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
    </tbody>
</table>
</div>
</body>
</html>
