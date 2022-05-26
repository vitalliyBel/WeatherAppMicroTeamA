package weatherApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.io.IOException;
import sendMessage.AppConfig;
import sendMessage.SendEmail;

public class Main {

    public static void main(String[] args) throws IOException {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        SendEmail bean = context.getBean(SendEmail.class);

        bean.sendMail();
    }
}

