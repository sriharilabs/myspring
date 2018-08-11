package com.example.demo;

import java.time.Instant;
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
		return emp;
	}
}
