package com.wch.event.event;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;

@Getter
public class DemoEvent extends ApplicationEvent {

    private String exampleString;

    public DemoEvent(Object source, String exampleString) {
        super(source);
        this.exampleString = exampleString;
    }
}
