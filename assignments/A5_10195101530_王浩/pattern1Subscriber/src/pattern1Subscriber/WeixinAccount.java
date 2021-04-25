package pattern1Subscriber;

public class WeixinAccount implements Subscriber {
    private String accountName;

    public WeixinAccount(String accountName) {
        this.accountName = accountName;
    }

    public void update(Publisher publisher) {
        System.out.println(accountName + "��΢���յ�������" + publisher + "���������£� " + publisher.getMessage());
    }
}