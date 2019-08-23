package com.paylog.project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class controller {
	@RequestMapping(value = "ma.do", method = RequestMethod.GET)
	public String home() {

		
		return "paylist_old.jsp";
	}

}
