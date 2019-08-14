package com.hickory.springboot.controller ;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hickory.springboot.dao.ContactDAO;
import com.hickory.springboot.model.Contact;

@Controller
public class HomeController 
{	
	@Autowired
	ContactDAO repo;
	@ModelAttribute
	public void modelData(Model m)
	{
		m.addAttribute("name","Contacts");
	}
	
    @RequestMapping("/")
	public String home() {
		return "index.jsp";
	}
    @GetMapping("getContacts")
	public String getContacts(Model m) {
    	
    	List<Contact> contacts = (List<Contact>) repo.findAll();
    	
    	m.addAttribute("result", contacts);
		return "showContacts.jsp";
	}
    @GetMapping("getContact")
    public String getContact(Model m)
    {
    	
    	List<Contact> contacts=Arrays.asList(new Contact(1,"Jeffa","Jeffameail","JeffaAdd","1234"));
    m.addAttribute("result",contacts);
    return "showContacts.jsp";
    
    }
    
	
	
	}

	

