package pattern1Subscriber;

public class Client {
    public static void main(String[] args) {
        WeixinPublisher publisher = new WeixinPublisher("101");
        publisher.addSubscriber(new WeixinAccount("张三"));
        publisher.addSubscriber(new WeixinAccount("李四"));
        publisher.addSubscriber(new WeixinAccount("王五"));

        publisher.publishMessage("Java设计模式_观察者模式");
    }
}