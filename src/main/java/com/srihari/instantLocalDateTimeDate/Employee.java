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
	@Override
	public int hashCode() {
		System.out.println("its hashcode...");
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		
		System.out.println("its equals...");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}
