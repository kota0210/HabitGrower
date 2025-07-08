package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.form.HabitRegistForm;

@Controller
public class HabitController {
	
//	習慣の登録画面表示
	@GetMapping("/regist-form")
	public String showRegist() {
		return "regist";
	}

//	
	@PostMapping("/regist-review")
	public String regist(@ModelAttribute HabitRegistForm form) {
		return "regist";
	}
}
