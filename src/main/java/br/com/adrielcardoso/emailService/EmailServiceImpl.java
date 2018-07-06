package br.com.adrielcardoso.emailService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailServiceImpl
{
//    @Autowired
//    public JavaMailSender emailSender;
//    @Autowired
//    public MailRepository mailRepository;

    public void sendSimpleMessage(UserDTO input) {
//        try {
//            Mail newMail = new Mail();
//            newMail.setTo(input.getUserName());
//            newMail.setSubject("Registration Success");
//            newMail.setText("Welcome, You have successfully registered!");
//            SimpleMailMessage message = new SimpleMailMessage();
//            message.setTo(newMail.getTo());
//            message.setSubject(newMail.getSubject());
//            message.setText(newMail.getText());
//            mailRepository.save(newMail);
//            emailSender.send(message);
//        } catch (MailException exception) {
//            exception.printStackTrace();
//        }
    }
}
