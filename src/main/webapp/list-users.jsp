<a href="add-user.jsp">Add New User</a>
<table border="1">
<tr><th>ID</th><th>Name</th><th>Email</th><th>Country</th><th>Action</th></tr>
<%
    List<model.User> users = (List<model.User>) request.getAttribute("list");
    for (model.User u : users) {
%>
<tr>
    <td><%= u.getId() %></td>
    <td><%= u.getName() %></td>
    <td><%= u.getEmail() %></td>
    <td><%= u.getCountry() %></td>
    <td>
        <a href="edit?id=<%=u.getId()%>">Edit</a>
        <a href="delete?id=<%=u.getId()%>">Delete</a>
    </td>
</tr>
<% } %>
</table>
