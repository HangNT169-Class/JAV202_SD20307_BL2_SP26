package com.poly.main.B13_Schedule.schedule;

import com.poly.main.B13_Schedule.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling // Bat schedule
public class TestScheduleDemoService {
    // Schedule => lam 1 viec gi do theo thoi gian da dat truoc
    // 1 ham => service

    @Autowired
    private DemoService demoService;

    // Cau hinh gio
    @Scheduled(fixedDelay = 2000) // ms => 1s = 1000 ms
    // cron job => custom được thời gian mong muốn khi đặt lịch
//    @Scheduled(cron = "0 9 25 * * ?")
    public void testSchedule() {
        demoService.dongHoBaoThuc();
    }
//    00:00:01
//    00:00:02
    // 70s -> 00: 01:10
}
