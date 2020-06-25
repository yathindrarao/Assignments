<%@ page import="java.util.*" %>
<%@ page import="com.example.demo.empPojo" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>



<!DOCTYPE html>
<html lang="en">
<head>
  <title>Report</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
  
</head>
<style>
  
</style>

<body>
<div class="container" style="text-align: center;margin-top:50px">
   <h2>Employee Details</h2>
   <br><br>
   <h4>Insert new employee</h4>
     <form action="insert" method="get">
     <button type="submit" class="btn btn-primary" >Insert</button>
     </form>
     <br><br>
  <div class="row">
  <form action="showbyid" method="get">
    
      <input type="text" name="empid" class="form-control" placeholder="Enter Id">
  <br>
  <button class="btn btn-primary" type="submit">Show details</button>
 
  </form>
  <form action="showbyname" method="get" style="margin-left:10%">
  
      <input type="text" name="empname" class="form-control" placeholder="Enter Name">
      <br>
  
  <button class="btn btn-primary" type="submit" >Show details</button>
  
  </form>
  </div>
   
     
  <table class="table table-bordered table-striped" style="margin-top:20px">
    <thead>
      <tr>
        <th>ID</th>
        <th>Name</th>
        <th>City</th>
        <th>Action</th>
       
      </tr>
    </thead>
    <tbody id="emptable">
    <c:forEach items="${empllist}" var="entry">
    <tr>
    <td> ${entry.key}</td> 
    <td> ${entry.value.name}</td>
    <td> ${entry.value.city}</td>
    <td><a href="update/${entry.key}">Update</a>&nbsp;&nbsp;&nbsp;
    <a onclick="return confirm('Are you sure to delete?')" href="delete/${entry.key}" >Delete</a></td>
    
    </tr>
    <br>
</c:forEach>
      
    </tbody>
  </table>
</div>


</body>
</html>
