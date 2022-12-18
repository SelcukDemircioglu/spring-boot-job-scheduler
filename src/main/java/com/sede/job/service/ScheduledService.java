package com.sede.job.service;


import java.util.Calendar;
import java.util.logging.Logger;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Data
@Setter
@EqualsAndHashCode
@Getter
@Service
public class ScheduledService {
    static final Logger LOGGER = Logger.getLogger(ScheduledService.class.getName());


    // @hourly,
    // @yearly,
    // @monthly,
    // @weeklyve
    // @daily
    // ┌───────────── second (0-59)
    // │ ┌───────────── minute (0 - 59)
    // │ │ ┌───────────── hour (0 - 23)
    // │ │ │ ┌───────────── day of the month (1 - 31)
    // │ │ │ │ ┌───────────── month (1 - 12) (or JAN-DEC)
    // │ │ │ │ │ ┌───────────── day of the week (0 - 7)
    // │ │ │ │ │ │          (or MON-SUN -- 0 or 7 is Sunday)
    // │ │ │ │ │ │
    // * * * * * *
    // @SchedulerLock(name = "scheduledTaskName")
    @Scheduled(cron = "*/20 * * * * *")
    @Async
    public void runTime() throws InterruptedException{
        var calendar= new Calendar.Builder().build();
        calendar.getTime();
     
        LOGGER.info(calendar.getTime().toString());
        System.out.println(calendar.getTime().toString());
    }

}
