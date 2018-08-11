package com.srihari.instantLocalDateTimeDate;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.IntStream;

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
	
	@GetMapping(value="/getSet")
	public @ResponseBody Set<Employee> getEmployee() {
		
		Map<Employee,String> map=getMapEmployee();
		Set<Employee> set = new HashSet<>(map.keySet());
		return set;
	}
	
	@GetMapping(value="/getMap")
	public @ResponseBody Map<Employee,String> getMapEmployee() {
		
		Map<Employee,String> map=new HashMap<Employee,String>();
		IntStream.range(0, 10).forEach(
				nbr ->{ System.out.println(nbr);
				map.put(getE(nbr), "sr");
				}
			);
		return map;
	}
	
	
	public Employee getE(int i) {
		Employee emp=new Employee();
		emp.setDate(new Date());
		emp.setIndate(Instant.now());
		emp.setName("srihari"+i);
		emp.setLocalDateTime(LocalDateTime.now());
		emp.setSqlDate(java.sql.Date.valueOf(LocalDate.now()));
		return emp;
	}
}
