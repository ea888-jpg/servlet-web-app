<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="org.example.servletwebapp.models.Member" %>


<%
    Member member = (Member) request.getAttribute("member");
%>

<html>
<head>
    <title>Member Info</title>
    <link rel="stylesheet" type="text/css" href="css/styles.css">
</head>
<body>
<div class="container">
    <h1>Member Information</h1>
    <div class="member-info">
        <p><strong>Name:</strong> <%= member.getName() %></p>
        <p><strong>Info:</strong> <%= member.getInfo() %></p>
    </div>
    <div class="back-link">
        <p><a href="index.jsp">Back to Team Members</a></p>
    </div>
</div>
</body>
</html>