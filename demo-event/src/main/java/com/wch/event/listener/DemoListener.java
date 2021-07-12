package com.wch.event.listener;

import cn.hutool.core.date.DateUtil;
import com.wch.event.event.DemoEvent;
import lombok.SneakyThrows;
import org.springframework.context.ApplicationListener;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Order(1)
public class DemoListener implements ApplicationListener<DemoEvent> {

    @SneakyThrows
    @Override
    @Async
    public void onApplicationEvent(DemoEvent demoEvent) {
        System.out.println("Run："+ DateUtil.format(new Date(), "yyyy-MM-dd HH:mm:ss")
            + ":" + demoEvent.getExampleString());
        Thread.sleep(1000);
    }

}
