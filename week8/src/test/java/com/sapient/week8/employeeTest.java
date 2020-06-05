package com.sapient.week8;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import com.sapient.week8.number;

public class employeeTest 
{
	
	addEmployee db=new addEmployee();
	@BeforeEach
	public void setup() throws Exception
	{
		
		employee employeeobj1=new employee();
		employeeobj1.setId(1);
		employeeobj1.setName("aditya");
		employeeobj1.setCity("ghaziabad");
		db.addEmployee(employeeobj1);
		employee employeeobj2=new employee();
		employeeobj2.setId(2);
		employeeobj2.setName("ram");
		employeeobj2.setCity("ayodhya");
		db.addEmployee(employeeobj2);
		employee employeeobj3=new employee();
		employeeobj3.setId(3);
		employeeobj3.setName("krishna");
		employeeobj3.setCity("vrindavan");
		db.addEmployee(employeeobj3);
	}
	@Test
    public void shouldcheckifemployeedetailsarecorrect() throws Exception
    {
    	employee obj=new employee();
    	obj.setId(4);
    	obj.setName("aman");
    	obj.setCity("jalandhar");
    	db.addEmployee(obj);
    }

	@Test
	public void shouldcheckiftheemployeevalueisvalid() throws Exception
	{   
		employee employeeobj1=new employee();
		employeeobj1.setId(1);
		employeeobj1.setName("aditya");
		employeeobj1.setCity("ghaziabad");
		db.addEmployee(employeeobj1);
		employee employeeobj2=new employee();
		employeeobj2.setId(2);
		employeeobj2.setName("ram");
		employeeobj2.setCity("ayodhya");
		db.addEmployee(employeeobj2);
		employee employeeobj3=new employee();
		employeeobj3.setId(3);
		employeeobj3.setName("krishna");
		employeeobj3.setCity("vrindavan");
		db.addEmployee(employeeobj3);
		employee expected=new employee();
		expected.setId(1);
		expected.setName("aditya");
		expected.setCity("ghaziabad");
		employee actual=db.getEmployee(1);
		assertEquals(expected.getId(),actual.getId());
		assertEquals(expected.getName(),actual.getName());
		assertEquals(expected.getCity(),actual.getCity());

		
		
	}
	@Test
	public void shouldcheckifemployeeofgivenidpresent() throws Exception
	{
		employee employeeobj1=new employee();
		employeeobj1.setId(1);
		employeeobj1.setName("aditya");
		employeeobj1.setCity("ghaziabad");
		db.addEmployee(employeeobj1);
		employee employeeobj2=new employee();
		employeeobj2.setId(2);
		employeeobj2.setName("ram");
		employeeobj2.setCity("ayodhya");
		db.addEmployee(employeeobj2);
		employee employeeobj3=new employee();
		employeeobj3.setId(3);
		employeeobj3.setName("krishna");
		employeeobj3.setCity("vrindavan");
		db.addEmployee(employeeobj3); 
		employee actual=db.getEmployee(1);
		
	}
}
