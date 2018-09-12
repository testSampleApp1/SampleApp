package com.quest.SampleApp.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.quest.SampleApp.service.MyService;

@RestController
public class SampleController {
	

	String ptr = null; 
	@RequestMapping(value = "/test1", method = RequestMethod.GET)
	public String init(@RequestParam("param") String param, HttpServletRequest request, HttpServletResponse response) throws Exception{
        try
        { 
            if (ptr.equals("gfg")) 
            	ptr = "Match found"; 
            else 
                ptr = "Match NOT found"; 
 
        } 
        catch(NullPointerException e) 
        { 
            ptr = "Exception occured";
        } 
        return ptr;
    }
 

	@RequestMapping(value = "/test2", method = RequestMethod.GET)
	public void test2() throws Exception{
	    int array[] = {20,20,40};
	      int num1 = 15, num2 = 10;
	      int result = 10;
	         result = num1/num2;
	         System.out.println("The result is" +result);
	         for(int i = 5; i >=0; i--) {
	           System.out.println("The value of array is" +array[i]) ;
	         }         
	}
	
	@RequestMapping(value = "test3", produces = { "text/html" }, method = RequestMethod.GET)
	public String test3() throws Exception{
		List list = new ArrayList();
		list.add("Java");
		list.add(new Integer(5));

		for(Object obj:list) {
			String str = (String)obj;
		}  
		return list.toString();
	}
	
	@RequestMapping(value = "test4", produces = { "text/html" }, method = RequestMethod.GET)
	public void test4(HttpServletRequest req, HttpServletResponse res) throws Exception{
		
		String testStr = "Hello World";
		
		if(null!=testStr)
		{
			res.sendRedirect("www.google.com");
		}
		if (testStr == "Hello World")
		{
			res.sendRedirect("www.wikipedia.com");
		}
		if (testStr.contains("or"))
		{
			res.sendRedirect("www.cnn.com");
		}
	}
	
	  @GetMapping("/example")
	  public void example() throws Exception {
	  MyService my = new MyService();
	    my.doStuff();
	  }

}
