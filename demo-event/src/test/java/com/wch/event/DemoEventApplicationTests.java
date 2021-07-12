package com.wch.event;

import cn.hutool.core.date.DateUtil;
import com.wch.event.event.DemoEvent;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoEventApplicationTests {
    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    @Test
    public void contextLoads() {
        System.out.println("Start：" + DateUtil.format(new Date(), "yyyy-MM-dd HH:mm:ss"));
        applicationEventPublisher.publishEvent(new DemoEvent(this, "测试"));
        System.out.println("End：" + DateUtil.format(new Date(), "yyyy-MM-dd HH:mm:ss"));
    }

    /*@Test
    public void contextLoads1() {
        System.out.println("Start：" + DateUtil.format(new Date(), "yyyy-MM-dd HH:mm:ss"));
        applicationEventPublisher.publishEvent(new DemoEvent(this, "测试"));
        System.out.println("End：" + DateUtil.format(new Date(), "yyyy-MM-dd HH:mm:ss"));
    }*/


}
