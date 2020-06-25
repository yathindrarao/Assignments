package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class empDao {
	private Map<Integer,empPojo> map=new HashMap<Integer,empPojo>();

	public Map<Integer, empPojo> getMap() {
		return map;
	}
	public empDao()
	{
		map.put(1,new empPojo(1,"Aditya","Ghaziabad"));
		map.put(2,new empPojo(2,"Ram","Ayodhya"));
		map.put(3,new empPojo(3,"atul","jalandhar"));
		
		
	}

	public void setMap(Map<Integer, empPojo> map) {
		this.map = map;
	}
    public void update(int id,String name,String city)
    {
    	empPojo obj=new empPojo(id,name,city);
    	map.put(id, obj);
    	
    }
    public void delete(int id)
    {
    	map.remove(id);
    }
    public void addNew(int id,String name,String city)
    {
    	map.put(id,new empPojo(id,name,city));
    	
    }
	@Override
	public String toString() {
		return "empDao [map=" + map + "]";
	}

	public empDao(Map<Integer, empPojo> map) {
		super();
		this.map = map;
	}

}
