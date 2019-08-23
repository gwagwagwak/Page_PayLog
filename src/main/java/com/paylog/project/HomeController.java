package com.paylog.project;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {

		
		return "index.jsp";
	}
	@RequestMapping(value = "main.do", method = RequestMethod.GET)
	public String new1() {

		
		return "index.jsp";
	}
	@RequestMapping(value = "paylist.do", method = RequestMethod.GET)
	public String new2() {

		
		return "paylist.jsp";
	}
	@RequestMapping(value = "myQnAlist.do", method = RequestMethod.GET)
	public String new3() {

		
		return "myQnAlist.jsp";
	}
	
}
