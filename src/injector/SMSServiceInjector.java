package injector;

import consumer.Consumer;
import consumer.MyApplication;
import service.SMSServiceImp;

public class SMSServiceInjector implements MessageServiceInjector {
    @Override
    public Consumer getConsumer() {
        return new MyApplication(new SMSServiceImp());
    }
}
