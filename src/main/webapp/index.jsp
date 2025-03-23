<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="org.example.servletwebapp.service.impl.MemberServiceImpl " %>
<%@ page import="org.example.servletwebapp.service.MemberService " %>
<%@ page import="org.example.servletwebapp.models.Member " %>
<%@ page import="java.util.List" %>

<%
    MemberService memberService = new MemberServiceImpl();
    List<Member> members = memberService.getMembers();
%>

<html>
<head>
    <title>Team Page</title>
    <link rel="stylesheet" type="text/css" href="css/styles.css">
</head>
<body>
<div class="container">
    <h1>Team Members</h1>
    <div class="members">
        <%
            for (Member member : members) {
        %>
        <div class="member">
            <a href="member?name=<%= member.getName() %>"><%= member.getName() %></a>
        </div>
        <%
            }
        %>
    </div>
    <div class="links">
        <p><a href="about.html">About Us</a></p>
        <p><a href="https://jakarta.ee">External Link</a></p>
    </div>
</div>
</body>
</html>