package com.springboot.security.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.springboot.security.entity.User;
import com.springboot.security.repository.UserRepo;
import com.springboot.security.service.UserService;

import jakarta.security.auth.message.callback.PrivateKeyCallback.Request;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {

	@Autowired
	private UserService userService;

	@Autowired
	private UserRepo userRepo;

	@GetMapping("/")
	public String index() {
		return "home";
	}

	@GetMapping("/home")
	public String homePage() {
		return "home";
	}

	@GetMapping("/login")
	public String loginPage() {
		return "login";
	}

	/*
	 * @GetMapping("/user/profile") public String profile(Principal p, Model m) {
	 * String email = p.getName(); User user = userRepo.findByEmail(email);
	 * m.addAttribute("user", user); System.out.println(user); return "profile"; }
	 */

	@GetMapping("/signin")
	public String login() {
		return "login";
	}

	@GetMapping("/user/home")
	public String home() {
		return "home";
	}
	/*
	 * @GetMapping("/register") public String register() { return"register"; }
	 */

	@PostMapping("/saveUser")
	public String saveUser(@ModelAttribute User user, HttpSession session, Model m, HttpServletRequest servletRequest) {

		String url = servletRequest.getRequestURL().toString();
		// System.out.println(url); http://localhost:8080/saveUser
		url = url.replace(servletRequest.getServletPath(), "");
		// System.out.println(url);

		User u = userService.saveUser(user, url);
		if (u != null) {
			session.setAttribute("msg", "Register Successfully");
		} else {
			session.setAttribute("msg", "Register Failed. Please Check.");
			System.out.println(u);
		}
		return "redirect:/register";
	}

	@GetMapping("/register")
	public String showRegisterPage(Model model, HttpSession session) {
		String msg = (String) session.getAttribute("msg");
		if (msg != null) {
			model.addAttribute("msg", msg);
			session.removeAttribute("msg");
		}
		model.addAttribute("RegisterPage", new User());
		return "register";
	}
	
	@GetMapping("/verify")
	public String verifyAccount(@Param("code")String code, Model m) {
		boolean f = userService.verifyAccount(code);
		if(f) {
			m.addAttribute("msg", "Successfully your account is verified");
		}else {
			m.addAttribute("msg", "may be your verification code is incorrect or already verified");
		}
		return "message";
	}
}
