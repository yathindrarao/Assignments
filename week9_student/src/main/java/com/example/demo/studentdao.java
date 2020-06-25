package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class studentdao {
Map<Integer,studentpojo> map=new HashMap<Integer,studentpojo>();

public studentdao()
{
	studentpojo obj1=new studentpojo();
	obj1.setId(1);
	obj1.setName("Aditya");
	obj1.setAge(21);
	obj1.setCity("Ghaziabad");
	map.put(1,obj1);
	studentpojo obj2=new studentpojo();
	obj2.setId(2);
	obj2.setName("Ram");
	obj2.setAge(21);
	obj2.setCity("Ayodhya");
	map.put(2,obj2);
	studentpojo obj3=new studentpojo();
	obj3.setId(3);
	obj3.setName("atul");
	obj3.setAge(21);
	obj3.setCity("jaladhar");
	map.put(3,obj3);
	
}
public studentdao(Map<Integer, studentpojo> map) {
	super();
	this.map = map;
}

@Override
public String toString() {
	return "studentdao [map=" + map + "]";
}

public Map<Integer, studentpojo> getMap() {
	return map;
}

public void setMap(Map<Integer, studentpojo> map) {
	this.map = map;
}


}
