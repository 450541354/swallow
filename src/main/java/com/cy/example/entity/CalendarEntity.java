package com.cy.example.entity;

import java.util.Date;

import org.springframework.stereotype.Repository;

@Repository
public class CalendarEntity extends BaseEntity{
	//用户 
	private String c_username;

	//事件
	private String c_title;

	//开始时间 
	private String d_start;

	//结束时间
	private String d_end;

	//事件级别 
	private String n_level;

	public String getC_username() {
		return c_username;
	}

	public void setC_username(String c_username) {
		this.c_username = c_username;
	}

	public String getC_title() {
		return c_title;
	}

	public void setC_title(String c_title) {
		this.c_title = c_title;
	}

	public String getD_start() {
		return d_start;
	}

	public void setD_start(String d_start) {
		this.d_start = d_start;
	}

	public String getD_end() {
		return d_end;
	}

	public void setD_end(String d_end) {
		this.d_end = d_end;
	}

	public String getN_level() {
		return n_level;
	}

	public void setN_level(String n_level) {
		this.n_level = n_level;
	}
	
}