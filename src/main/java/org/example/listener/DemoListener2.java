package org.example.listener;

import org.example.event.DemoEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class DemoListener2 {

    @EventListener
    public void onApplicationEvent(DemoEvent demoEvent) {
        System.out.println(">>>>>>>>>DemoListener2>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("DemoListener2收到了：" + demoEvent.getSource() + "消息;时间：" + new Date(demoEvent.getTimestamp()).toLocaleString());
        System.out.println("DemoListener2消息：" + demoEvent.getId() + ":" + demoEvent.getMessage());
    }
}