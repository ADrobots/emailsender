package com.emailsender;

import com.emailsender.ssl.Sender;

import javax.mail.MessagingException;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;


public class Main {
    public static com.emailsender.tls.Sender tlsSender=new com.emailsender.tls.Sender("prommetall66@gmail.com", "ronaldo_85");
    public static com.emailsender.ssl.Sender sslSender=new com.emailsender.ssl.Sender("prommetall66@gmail.com", "ronaldo_85");

    public static void main(String[] args){

        try {
            tlsSender.send("Theis is Subject",
                    "TLS: This is text",
                    "prommetall66@gmail.com",
                    "promet66@inbox.ru");
            /*sslSender.send("Theis is Subject",
                    "SSL: This is text",
                    "prommetall66@gmail.com",
                    "promet66@inbox.ru");*/
        }catch (MessagingException mes){}

       /* Timer timer=new Timer();
        Date date=new Date();

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                try {
                    tlsSender.send("Theis is Subject"+date.toString(),
                            "TLS: This is text",
                            "prommetall66@gmail.com",
                            "promet66@inbox.ru");
                    sslSender.send("Theis is Subject"+date.toString(),
                            "SSL: This is text",
                            "prommetall66@gmail.com",
                            "promet66@inbox.ru");
                    System.out.println(date.toString());
                }catch (MessagingException mes){}

            }

        },1*60*1000);
*/
    }

}
