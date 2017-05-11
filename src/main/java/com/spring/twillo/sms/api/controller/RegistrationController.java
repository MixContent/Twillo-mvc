/**
 * 
 */
package com.spring.twillo.sms.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.twillo.sms.api.model.User;
import com.spring.twillo.sms.api.service.RegisterService;

/**
 * @author BASANTA
 *
 */
@Controller
public class RegistrationController {
	@Autowired
	private RegisterService service;

	@RequestMapping(value = "/view")
	public String viewRegistration() {
		return "register";
	}

	@RequestMapping(value = "/register")
	public String register(@ModelAttribute("user") User user, Model model) {
		String message1 = "Registration successfully..";
		String message = message1 + " with SLTOKEN : " + service.Register(user);
		model.addAttribute("message", message);
		return "register";
	}
}
