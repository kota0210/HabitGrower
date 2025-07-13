package com.example.demo.form;

import java.sql.Date;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import lombok.Data;

@Data
public class HabitRegistForm {

	@NotNull(message="登録する習慣を入力してください。")
	private String habit;
	
	private String category;
	
	@Past(message="今日以前の日付を入力してください")
	private Date actDate;
	
	private String frequency;
}
