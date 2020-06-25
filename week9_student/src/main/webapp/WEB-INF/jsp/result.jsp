 <%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<title>student form</title>


<body>
<h1>Student Details</h1>
<h2>Enter id:</h2>
<form action="showresult" method="post">
<input type="text" name="studentid" placeholder="studentid">
</form>
<h3>Id:${id}</h3>
<h3>Name:${name}</h3>
<h3>Age:${age}</h3>
<h3>City:${city}</h3>


</body>
</html>