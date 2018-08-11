package com.srihari.instantLocalDateTimeDate;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	
	@PostMapping
	public @ResponseBody Employee postEmployee(@RequestBody Employee emp) {
		
		emp.getLocalDateTime().getChronology().dateNow();
		return emp;
		
	}
	
	@GetMapping(value="/")
	public @ResponseBody Employee getEmployee() {
		Employee emp=new Employee();
		emp.setDate(new Date());
		emp.setIndate(Instant.now());
		emp.setName("srihari");
		emp.setLocalDateTime(LocalDateTime.now());
		//long time = System.currentTimeMillis();
		//java.sql.Date date = new java.sql.Date(time);
		//java.sql.Date.
		emp.setSqlDate(java.sql.Date.valueOf(LocalDate.now()));
		return emp;
	}
}
