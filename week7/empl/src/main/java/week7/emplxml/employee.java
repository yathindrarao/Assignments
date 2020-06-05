package week7.emplxml;

public class employee {
private int id;
private String name;
private String city;
public int getId() {
	return id;
}
public employee()
{
	
}
public employee(int id, String name, String city) {
	super();
	this.id = id;
	this.name = name;
	this.city = city;
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
@Override
public String toString() {
	return "employee [id=" + id + ", name=" + name + ", city=" + city + "]";
}

}
