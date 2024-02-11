<%--
  Created by IntelliJ IDEA.
  User: Professional
  Date: 09.02.2024
  Time: 1:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

<h1>Task Details</h1>
</head>
<body>
<h1>Tasks List</h1>
<table border="1">
    <thead>
    <tr>
        <th>Name</th>
        <th>Description</th>
        <th>Deadline Date</th>
        <th>Actions</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="task" items="${AtrTasks}">
        <tr>
            <td>${task.name}</td>
            <td>${task.description}</td>
            <td>${task.deadlineDate}</td>
            <td>
                <a href="details?taskId=${task.id}">Details</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>