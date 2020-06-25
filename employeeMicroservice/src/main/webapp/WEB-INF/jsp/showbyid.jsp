<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>employee details</title>
</head>
<body>
    <div align="center">
        <h1>employee details</h1>
        <br/>
        
 
            <table border="0" cellpadding="10">
                <tr>             
                    <td>Employee ID:</td>
                    <td>
                        <input type="text" placeholder="enter id" value="${empid}" readonly />
                    </td>
                </tr>        
                <tr>             
                    <td>Employee Name:</td>
                    <td>
                        <input type="text" placeholder="enter name" value="${empname}"  />
                    </td>
                </tr>
                <tr>
                    <td>Employee City:</td>
                    <td><input placeholder="enter city" type="text" name="empcity" value="${empcity}" /></td>
                </tr>
                 <tr>
                    <td colspan="2"><a href="home">Back</a></td>
                </tr>
                
            </table>
        
    </div>
</body>
</html>