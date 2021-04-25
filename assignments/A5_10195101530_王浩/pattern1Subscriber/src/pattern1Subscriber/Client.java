package pattern1Subscriber;

public class Client {
    public static void main(String[] args) {
        WeixinPublisher publisher = new WeixinPublisher("101");
        publisher.addSubscriber(new WeixinAccount("����"));
        publisher.addSubscriber(new WeixinAccount("����"));
        publisher.addSubscriber(new WeixinAccount("����"));

        publisher.publishMessage("Java���ģʽ_�۲���ģʽ");
    }
}