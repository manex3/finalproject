package com.multi.schedules;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.SchedulesDTO;
import com.multi.service.SchedulesService;


@SpringBootTest
class Updateschedules {
	@Autowired
	SchedulesService service;
	
	@Test
	void contextLoads() {
		Date today=new Date();
		
		SchedulesDTO schedules = new SchedulesDTO(0, 0, null, today, today, null, 0, null, null, null, 0, null);
		try {
			service.modify(schedules);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
