package injector;

import consumer.Consumer;
import consumer.MyApplication;
import service.EmailServiceImp;

public class EmailServiceInjector implements MessageServiceInjector {
    @Override
    public Consumer getConsumer() {
        return new MyApplication(new EmailServiceImp());
    }
}
