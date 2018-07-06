package br.com.adrielcardoso.emailService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import java.util.concurrent.CountDownLatch;

public class Receiver
{
    private CountDownLatch latch = new CountDownLatch(1);

    @Autowired
//    private EmailService emailService;

    @KafkaListener(topics = "${spring.kafka.topic.userRegistered}")
    public void receive(UserDTO payload) {
//        emailService.sendSimpleMessage(payload);
        latch.countDown();
    }
}