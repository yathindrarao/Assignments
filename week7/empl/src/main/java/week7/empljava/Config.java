package week7.empljava;
import org.springframework.context.annotation.*;

@Configuration
public class Config {
	@Bean
	public Employee employeeCreation() {
		return new Employee();
	}
}