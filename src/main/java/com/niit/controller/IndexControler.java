package com.niit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//commented by junaid
@Controller
public class IndexControler
{	
	@RequestMapping(value={"/home","/"})
	public String m1()
	{
		return "index";
	}
	
	@RequestMapping(value={"/contact"})
	public String m2()
	{
		return "contactus";
	}
	
	@RequestMapping(value={"/about"})
	public String m3()
	{
		return "aboutus";
	}
}
