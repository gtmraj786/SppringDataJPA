<%@ page import="java.util.List" %>
<%@ page import="springdatajpa.pojos.Post" %>
<%@ page isELIgnored = "false" %>
<html>
<body>


<%List<Post>list=(List<Post>) request.getAttribute("listPost");%>

    <h1>My Blog</h1>

    <h3><a href="new">Create post</a></h3>




    <%for(Post customer:list){%>
<br>------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
     <br>Title:
        <%=customer.getTitle()%><br>
    Content:
        <%=customer.getContent()%>
               <br>
            <td><a href="edit?id=<%=customer.getId()%>">Edit</a>
            <td><a href="deleteConfirm?id=<%=customer.getId()%>">Delete</a>

    <%}%>


</body>
</html>
