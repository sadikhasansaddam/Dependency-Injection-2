package service;

public class SMSServiceImp implements MessageService {
    @Override
    public void sendMessage(String message, String receiver) {
        //logic to send SMS
        System.out.println("SMS sent to " + receiver + " with Message " + message );
    }
}
