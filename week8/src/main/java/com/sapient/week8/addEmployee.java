package com.sapient.week8;

import java.util.ArrayList;
import java.util.List;

public class addEmployee {
	List<employee> list=new ArrayList<employee>();
	public void addEmployee(employee emp) throws Exception
	{
		if(emp.getName()==""||emp.getName()==null)
			throw new Exception("incorrect name value");
		if(emp.getCity()==""||emp.getCity()==null)
			throw new Exception("incorrect city value");
		list.add(emp);
	}
	public employee getEmployee(int id) throws Exception
	{
		for(employee obj:list)
		{   //System.out.println(obj.getId());
			if(obj.getId()==id)
			{   
				return obj;
			}
		}
		throw new Exception("No employee with this id found");
	}
}
