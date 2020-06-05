package week7.empljava;
import java.util.Scanner;

public class EmployeeRunner 
{
    public static void main( String[] args )
    {	
    	// we need a bean factory to make beans 
    	// we could have also used the ApplicationContext 
    	EmployeeService database = new EmployeeService(); 
    	int input; 
    	Scanner scan = new Scanner(System.in);
    	while(true) {
    		System.out.println("Enter 1 to add employee and 0 to quit"); 
    		input = scan.nextInt();  
    		if(input == 0) break;
    		else {
    			database.read(); 
    		}
    	}
    	// Now search for the Employee using its id 
    	System.out.println("Enter the employee's id to be searched");
    	int id = scan.nextInt();
    	Employee result = database.SearchById(id);
    	System.out.println(result.toString());
    }
}