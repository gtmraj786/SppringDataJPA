<%--
  Created by IntelliJ IDEA.
  User: Gautam Rajbhar
  Date: 25-12-2019
  Time: 20:49
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
<h2>New Post<h2>
    <form:form action="save" method="post" modelAttribute="post">
     <table>
         <tr>
             <td>Title:</td>
             <td><form:input path="title"/></td>
         </tr>
             <tr><td>Content:</td>
             <td><form:input path="content"/></td>
  </tr>

         <tr><td><input type="submit" value="publish"></td></tr>
     </table>
        </form:form>
</div>
</body>
</html>
