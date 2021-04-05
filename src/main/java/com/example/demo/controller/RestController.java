package com.example.demo.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@GetMapping("/")
	public ModelAndView index(Model model) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index.html");
		return mav;
	}
	@GetMapping("/apitest")
	public ModelAndView apiTestMain(Model model) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("apitest.html");
		return mav;
	}
	@PostMapping("/cslssend")
	public String cslssend(HttpServletResponse httpServletResponse) {
		return "redirect:http://www.naver.com";
	}
	
	@PostMapping("/resend")
	public String resend(HttpServletResponse httpServletResponse) {
		return "redirect:http://www.naver.com";
	}
	
	@PostMapping("/allordercancel")
	public String allordercancel(HttpServletResponse httpServletResponse) {
		return "redirect:http://www.naver.com";
	}
	
	@PostMapping("/couponDetail")
	public String couponDetail(HttpServletResponse httpServletResponse) {
		return "redirect:http://www.naver.com";
	}
}
