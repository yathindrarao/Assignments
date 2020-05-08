package week5;

import java.util.Comparator;

public class student implements Comparator<student>  {
private int id;
private String name;
private String city;
public int getId() {
	return id;
}   
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public void read()
{
	this.id=Integer.parseInt(read.br.nextLine());
	
	this.name=read.br.nextLine();
	this.city=read.br.nextLine();
}
public void disp()
{
	System.out.println(id+" "+name+" "+city);
	
	
}
public String toString(){
	  return id+" "+name+" "+city;  
	 }
@Override
public int compare(student o1, student o2) {
	// TODO Auto-generated method stub
	return 0;
}
 


}
 class namesort implements Comparator<student>
{

	public int compare(student a,student b) {
		// TODO Auto-generated method stub
		return a.getName().compareTo(b.getName());
	}
}
class citysort implements Comparator<student>
{

	@Override
	public int compare(student o1, student o2) {
		// TODO Auto-generated method stub
		return o1.getCity().compareTo(o2.getCity());
	}
	
	
}
	

