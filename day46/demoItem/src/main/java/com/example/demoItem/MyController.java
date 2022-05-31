package com.example.demoItem;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {

	@GetMapping("/main")
	public String gotoFirst(@RequestParam String uname,HttpSession session) {
		Item it1=new Item("A", 100);
		Item it2=new Item("B", 200);
		Item it3=new Item("C", 300);
		Item it4=new Item("D", 400);
		Item it5=new Item("E", 500);
		Item it6=new Item("F", 600);
		List<Item> dbitems=new ArrayList<>();
		dbitems.add(it1);
		dbitems.add(it2);
		dbitems.add(it3);
		dbitems.add(it4);
		dbitems.add(it5);
		dbitems.add(it6);
		
		session.setAttribute("iteminfo", dbitems);
		session.setAttribute("uname", uname);
		List<Item> items=new ArrayList<>();
		session.setAttribute("cart", items);
		
		
		return "main";
	}
	@GetMapping("/second")
	public String gotoSecond(@RequestParam List<String> items,HttpSession session) {
		
		List<Item> db=(List<Item>) session.getAttribute("iteminfo");
		
		List<Item> cart=(List<Item>) session.getAttribute("cart");
		for(String s:items) {
			
			for(Item item:db) {
				if(item.getName().equals(s)) {
					Item it=new Item(item.getName(),item.getCost());
					cart.add(it);
				}
			}
			
		}
		session.setAttribute("cart", cart);
		
		return "second";
	}
	
	@GetMapping("/checkout")
	public String checkout(HttpSession session) {
		List<Item> cart=(List<Item>) session.getAttribute("cart");
		int total=0;
		for(Item item:cart) {
			
			System.out.println(item.getName()+"=>"+item.getCost());
			total+=item.getCost();
			
			
			
		}
		System.out.println("Toal cost is "+total);
		
		return "checkout";
	}
	
	
	
	
}