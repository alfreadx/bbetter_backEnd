package com.future.bbetter.schedule.resource.impl;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.future.bbetter.exception.customize.DataNotFoundException;
import com.future.bbetter.schedule.resource.ScheduleRemindResource;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RunWith(SpringRunner.class)
@DataJpaTest
@ActiveProfiles("test")
public class ScheduleRemindResourceImplTest {
	
	
	@TestConfiguration
	static class ScheduleRemindResourceImplTestContextConfiguration {
		@Bean
		public ScheduleRemindResource scheduleRemindResource() {
			return new ScheduleRemindResourceImpl();
		}
	}

	@Autowired
	private TestEntityManager entityMgr;

	@Autowired
	private ScheduleRemindResource schRemindRs;
	
	/***
	 * 測試getScheduleRemind(),當給予資料庫找不到的id時,應會丟出DataNotFoundException
	 */
	@Test
	public void whenGetScheduleRemindAndNotFound_thenThrowsException() {
		//given
		Long remindId = 10L;

		//when
		Throwable thrown = catchThrowable(() -> {
			schRemindRs.getScheduleRemind(remindId);
		});
		
		//then
		assertThat(thrown).isInstanceOf(DataNotFoundException.class)
			.hasMessageContaining("It can not find data,ScheduleRemindId:");
	}
}
