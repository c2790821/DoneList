package com.example.Model;


import java.text.SimpleDateFormat;
import java.util.Date;

public class ListModel {
	String date;
	String content;
	
	public ListModel() {
		
	}
	
	public ListModel(String content) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		this.date    = sdf.format(new Date());
		this.content = content;
	}
	
	public ListModel(String content, String date) {
		this.date 	 = date;
		this.content = content;
	}
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
}
