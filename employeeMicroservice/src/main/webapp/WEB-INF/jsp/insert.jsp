<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>Enter employee details</title>
</head>
<body>
    <div align="center">
        <h1>Enter details</h1>
        <br/>
        <form action="../create" method="post">
 
            <table border="0" cellpadding="10">
                <tr>             
                    <td>Employee ID:</td>
                    <td>
                        <input type="text" placeholder="enter id" name="empid"  />
                    </td>
                </tr>        
                <tr>             
                    <td>Employee Name:</td>
                    <td>
                        <input type="text" placeholder="enter name" name="empname" value="${emp.name}" />
                    </td>
                </tr>
                <tr>
                    <td>Employee City:</td>
                    <td><input placeholder="enter city" type="text" name="empcity" value="${emp.city}" /></td>
                </tr>
                 <tr>
                    <td colspan="2"><button type="submit">Save</button> </td>
                </tr>
                
            </table>
        </form>
    </div>
</body>
</html>