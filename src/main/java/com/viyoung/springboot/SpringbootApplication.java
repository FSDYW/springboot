package com.viyoung.springboot;

import com.viyoung.springboot.util.LocalDateUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * @author Vi-Young
 */
@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
	    //打印日历格式的当前日期，使用*标注
        LocalDateUtil.printNowDayCalender();
        SpringApplication.run(SpringbootApplication.class, args);
	}


}
