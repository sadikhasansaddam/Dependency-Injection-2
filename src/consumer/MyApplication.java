package consumer;

import service.MessageService;

public class MyApplication implements Consumer {
    private MessageService service;

    public MyApplication(MessageService service) {
        this.service = service;
    }

    public MyApplication() {
    }

    // setter


    public void setService(MessageService service) {
        this.service = service;
    }

    @Override
    public void prepareMessage(String msg, String rec) {
        //do some msg validation, manipulation logic etc
        this.service.sendMessage(msg, rec);
    }
}
