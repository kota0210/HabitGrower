package com.example.demo.form;

import java.sql.Date;

import lombok.Data;

@Data
public class HabitRegistForm {

	private String habit;
	private String category;
	private Date actDate;
	private String frequency;
}
