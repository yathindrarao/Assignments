package week7.empljava;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;


public class EmployeeService {
	List<Employee> employees = new ArrayList<Employee>();
	public void read() {
		int id;
		String name;
		String city;
		System.out.println("Enter the id, name, and city of the Employee");
		Scanner scan = new Scanner(System.in);
		id = scan.nextInt();
		name = scan.next();
		city = scan.next(); 
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		Employee emp = ctx.getBean(Employee.class);
    	emp.setId(id);
    	emp.setName(name);
    	emp.setCity(city);
    	employees.add(emp);
	}
	public Employee SearchById(int id) throws NoSuchElementException{
		for (Employee employee : employees) {
			if(employee.getId() == id) {
				return employee; 
			}
		}
		throw new NoSuchElementException();
	}
}