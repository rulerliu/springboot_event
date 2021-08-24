package org.example.listener;

import org.example.event.DemoEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class DemoListener implements ApplicationListener<DemoEvent> {

    @Override
    public void onApplicationEvent(DemoEvent demoEvent) {
        System.out.println(">>>>>>>>>DemoListener>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("DemoListener收到了：" + demoEvent.getSource() + "消息;时间：" + new Date(demoEvent.getTimestamp()).toLocaleString());
        System.out.println("DemoListener消息：" + demoEvent.getId() + ":" + demoEvent.getMessage());
    }
}