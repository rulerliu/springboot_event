package org.example;

import org.example.publisher.DemoPublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Test;

@SpringBootTest
public class AppTest {

    @Autowired
    private DemoPublisher demoPublisher;

    @Test
    public void shouldAnswerWithTrue() {
        demoPublisher.publish(1L, "成功了！");
    }
}