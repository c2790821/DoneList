package com.example.DoneList.Model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ListModel {
	private Integer id;
	private String date;
	private String content;

	public ListModel() {

	}

	public ListModel(String content) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		this.date = sdf.format(new Date());
		this.content = content;
	}

	public ListModel(String content, String date) {
		this.date = date;
		this.content = content;
	}
	
	public ListModel(Integer id, String content, String date) {
		this.id = id;
		this.date = date;
		this.content = content;
	}

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
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
	
	@Override
	public String toString() {
		return this.id + this.date + this.content;
	}

}
