package com.niit.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.dao.ProductDAO;
import com.niit.model.Product;

@Controller
@RequestMapping("/book")
public class BookController 
{
	@Autowired
	ProductDAO productdao;
	
	@RequestMapping("/")
	public String m1()
	{
		return "displaybooks";
	}
	
	@GetMapping("/add")
	public String m2(ModelMap map)
	{
		map.addAttribute("book" ,new Product()); 
		return "addbook";
	}
	
	@PostMapping("/add")
	public String m3(@ModelAttribute("book") Product product)
	{
		productdao.addProduct(product);
		return "redirect:/book/";
	}

}
