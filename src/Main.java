import consumer.Consumer;
import injector.EmailServiceInjector;
import injector.MessageServiceInjector;
import injector.SMSServiceInjector;

public class Main {
    public static void main(String[] args) {
        String msg = "Hi Saddam";
        String email = "saddam@gmail.com";
        String phone = "44000057";

        MessageServiceInjector injector = null;
        Consumer app = null;

        // send email
        injector = new EmailServiceInjector();
        app = injector.getConsumer();
        app.prepareMessage(msg, email);

        // send SMS
        injector = new SMSServiceInjector();
        app = injector.getConsumer();
        app.prepareMessage(msg, phone);

    }
}