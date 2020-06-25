<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>Edit employee details</title>
</head>
<body>
    <div align="center">
        <h1>Edit details</h1>
        <br />
        <form action="../../save" method="post">
 
            <table border="0" cellpadding="10">
                <tr>             
                    <td>Employee ID:</td>
                    <td>
                        <input type="text" value="${emp.id}" name="empid" readonly="readonly" />
                    </td>
                </tr>        
                <tr>             
                    <td>Employee Name:</td>
                    <td>
                        <input type="text" name="empname" value="${emp.name}" />
                    </td>
                </tr>
                <tr>
                    <td>Employee City:</td>
                    <td><input type="text" name="empcity" value="${emp.city}" /></td>
                </tr>
                 <tr>
                    <td colspan="2"><button type="submit">Save</button> </td>
                </tr>
                
            </table>
        </form>
    </div>
</body>
</html>