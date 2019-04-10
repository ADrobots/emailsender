import com.emailsender.ssl.Sender;

import javax.mail.MessagingException;


public class Main {
    private static com.emailsender.tls.Sender tlsSender=new com.emailsender.tls.Sender("prommetall66@gmail.com", "ronaldo_85");
    private static com.emailsender.ssl.Sender sslSender=new com.emailsender.ssl.Sender("prommetall66@gmail.com", "ronaldo_85");

    public static void main(String[] args){
        try {
            tlsSender.send("Theis is Subject", "TLS: This is text", "prommetall66@gmail.com", "promet66@inbox.ru");
            sslSender.send("Theis is Subject", "SSL: This is text", "prommetall66@gmail.com", "promet66@inbox.ru");

        }catch (MessagingException mes){}

        }
}
