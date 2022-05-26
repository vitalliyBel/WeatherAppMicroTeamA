package weatherApplication;

import sendMessage.AppConfig;

public class Main {

    public static void main(String[] args) throws IOException {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        SendEmail bean = context.getBean(SendEmail.class);

        bean.sendMail();
    }
}

