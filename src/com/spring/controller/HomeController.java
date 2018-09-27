package com.spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.servlet.ModelAndView;

public class HomeController {
 
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home(HttpSession session, HttpServletRequest request, HttpServletResponse response) {
	response.setContentType("text/html;charset=UTF-8");

	System.out.println("Home Page Requested");
	ModelAndView model = new ModelAndView("home");
	try {

	return model;
	} catch (Exception e) {
	e.getStackTrace();
	}
	return model;
	}
}
