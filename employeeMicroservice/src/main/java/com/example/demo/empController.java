package com.example.demo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class empController {
	
@Autowired
empDao empdao;

@GetMapping("/home")
public ModelAndView viewAll(Model model)
{
	model.addAttribute("empllist",empdao.getMap());
	
	return new ModelAndView("home");
}
@GetMapping("/update/{id}")
public ModelAndView update(@PathVariable(name = "id") int id,Model model)
{
	model.addAttribute("emp",empdao.getMap().get(id));
	
	return new ModelAndView("update");
}
@PostMapping("/save")
public void save(@RequestParam("empid") int employeeid,
		                  @RequestParam("empname") String employeename ,
		                  @RequestParam("empcity") String employeecity,
		                  HttpServletResponse response) throws IOException
{
	empdao.update(employeeid,employeename,employeecity);
	
	response.sendRedirect("home");
}
@GetMapping("/insert")
public ModelAndView insert(Model model)
{ 
	
	return new ModelAndView("insert");
}
@GetMapping("/showbyid")
public ModelAndView showbyid(@RequestParam("empid") int employeeid,Model model)
{
	for (int id : empdao.getMap().keySet()) 
    { 
        // search  for value 
        if(employeeid==empdao.getMap().get(id).getId())
        {
        	model.addAttribute("empid",id);
        	model.addAttribute("empname",empdao.getMap().get(id).getName());
        	model.addAttribute("empcity",empdao.getMap().get(id).getCity());
        	return new ModelAndView("showbyid");
        }
        } 
	return new ModelAndView("invalid");
}
@GetMapping("/showbyname")
public ModelAndView showbyname(@RequestParam("empname") String employeename,Model model)
{   
	 
	for (int id : empdao.getMap().keySet()) 
    {  
        // search  for value 
		
        if(empdao.getMap().get(id).getName().equals(employeename))
        {   
            System.out.println(empdao.getMap().get(3));

        	model.addAttribute("empid",id);
        	model.addAttribute("empname",empdao.getMap().get(id).getName());
        	model.addAttribute("empcity",empdao.getMap().get(id).getCity());
        	return new ModelAndView("showbyname");
        	
        }
        
        } 
	
	return new ModelAndView("invalid");
	
}
@PostMapping("/create")
public void create(@RequestParam("empid") int employeeid,
		                  @RequestParam("empname") String employeename ,
		                  @RequestParam("empcity") String employeecity,
		                  HttpServletResponse response) throws IOException
{
	
	empdao.addNew(employeeid,employeename,employeecity);
	response.sendRedirect("home");
}
@GetMapping("/delete/{id}")
public void delete (@PathVariable(name = "id") int id,Model model,HttpServletResponse response) throws IOException
{
	empdao.delete(id);
	response.sendRedirect("../home");
}
@PostConstruct
public void init(){
   // init code goes here
	empdao=new empDao();
}



	

}
