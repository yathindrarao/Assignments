package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class studentcontroller {
    @Autowired
	studentdao stddao;
	@GetMapping("/getid")
	public String getform()
	{
		return "getid";
	}
	 @PostMapping("/showresult")                     // it only support port method
	    public String saveDetails(@RequestParam("studentid") String studentid,
	                              Model model) {
	        // write your code to save details
	        stddao=new studentdao();
	        int stdid=Integer.parseInt(studentid);
	              studentpojo stdobj= stddao.getMap().get(stdid);
	        	try {
	        		int id=stdobj.getId();
		        	String name=stdobj.getName();
		        	int age=stdobj.getAge();
		        	String city=stdobj.getCity();
		        	model.addAttribute("id",id);
		        	model.addAttribute("name",name);
		        	model.addAttribute("age",age);
		        	model.addAttribute("city",city);
		        	return "result" ;
		        	}
	        	catch(Exception e){
	        		return "invalidId";
	        	}
	 }
}
	        
	        
	                  
	    


