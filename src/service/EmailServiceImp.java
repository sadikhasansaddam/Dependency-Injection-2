package service;

public class EmailServiceImp implements MessageService  {
    @Override
    public void sendMessage(String message, String receiver) {
        //logic to send email
        System.out.println("Email sent to " + receiver + " with Message " + message );
    }
}
