package com.example.blog.commom.schedule;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Component
public class ScheduleTest {

    @Scheduled(fixedRate = 1000)
    public void scheduleFixedRateTest() {
        System.out.println("전 작업이 종료되고 1초 뒤 실행 ");
    }

    @Scheduled(fixedDelay = 1000)
    public void scheduleFixedDelayTest() {
        System.out.println("시간에 맞춰 1초마다 실행 실행");
    }

    @Scheduled(fixedDelay = 4000 , initialDelay = 2000)
    public void scheduleFixedDelayWithInitialDelayTest(){
        System.out.println("처음은 2초뒤 실행 그후엔 4초 ");
    }
}
