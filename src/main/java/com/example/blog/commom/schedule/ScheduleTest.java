package com.example.blog.commom.schedule;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Component
public class ScheduleTest {
    
    @Scheduled(fixedDelay = 1000)
    public void scheduleTest() {
        int count = 0;
        count++;
        System.out.println(count);
    }

}
