package com.srihari.instantLocalDateTimeDate;

import java.util.Date;
import java.time.Instant;
import java.time.LocalDateTime;

import org.springframework.stereotype.Component;


@Component
public class Employee {
	private Instant indate;
	private String name;
	private LocalDateTime localDateTime;
	private Date date;
	private java.sql.Date sqlDate;
	
	
	public java.sql.Date getSqlDate() {
		return sqlDate;
	}
	public void setSqlDate(java.sql.Date sqlDate) {
		this.sqlDate = sqlDate;
	}
	public LocalDateTime getLocalDateTime() {
		return localDateTime;
	}
	public void setLocalDateTime(LocalDateTime localDateTime) {
		this.localDateTime = localDateTime;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Employee() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Instant getIndate() {
		return indate;
	}
	public void setIndate(Instant indate) {
		this.indate = indate;
	}
	
	
	
}
