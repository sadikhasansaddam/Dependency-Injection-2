package consumer;

public interface Consumer {
    void prepareMessage(String msg, String rec);
}
