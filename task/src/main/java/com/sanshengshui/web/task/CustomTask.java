package com.sanshengshui.web.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class CustomTask {
    public static final Logger logger = LoggerFactory.getLogger(CustomTask.class);

    @Scheduled(fixedRate = 1000 * 10,initialDelay = 1000 * 5)
    private void taskRun(){
        logger.info("CustomTask run ...");
    }
}
