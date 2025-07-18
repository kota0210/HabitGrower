package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.form.HabitRegistForm;

@Controller
public class HabitController {
	
//	習慣の新しい登録か進捗の登録か選択
	@GetMapping("/select-regist-progress")
	public String showSelect() {
		return "Select";
	}
//	新しい習慣の登録画面表示
	@GetMapping("/regist-form")
	public String showRegist() {
		return "regist";
	}

//	新しい習慣の登録内容に入力ミスがないか確認
	@PostMapping("/regist-review")
	public String regist(@Validated @ModelAttribute HabitRegistForm form,
			BindingResult result) {
		
//		入力エラーがある場合にはレビュー登録画面に戻す
		if(result.hasErrors()) {
			return "regist";
		}
		
//		正常な場合にはレビュー登録確認画面に遷移する
		
		return "regist";
	}
}
