package week7.emplxml;


import java.util.*;
import org.springframework.context.annotation.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class demoxml {
 public static void main(String []args)
 {
	 
	 ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
	 
	 employeelist obj=(employeelist) context.getBean("empllist");
	 System.out.println(obj);
	 System.out.println("enter id");
	 int id=read.scanner.nextInt();
	 System.out.println(obj.getMaps().get(id));
	 
	 	 
 }
 
}