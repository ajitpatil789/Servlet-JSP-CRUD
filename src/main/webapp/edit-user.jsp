<%@ page import="model.User" %>
<%
    User u = (User) request.getAttribute("user");
%>
<form action="update" method="post">
    <input type="hidden" name="id" value="<%= u.getId() %>">
    Name: <input type="text" name="name" value="<%= u.getName() %>"><br>
    Email: <input type="email" name="email" value="<%= u.getEmail() %>"><br>
    Country: <input type="text" name="country" value="<%= u.getCountry() %>"><br>
    <input type="submit" value="Update User">
</form>
