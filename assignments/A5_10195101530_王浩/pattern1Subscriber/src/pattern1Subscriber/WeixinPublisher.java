package pattern1Subscriber;

public class WeixinPublisher extends Publisher {
    private String dingyuehao;

    public WeixinPublisher(String dingyuehao) {
        this.dingyuehao = dingyuehao;
    }

    @Override
    public String toString() {
        return "Î¢ÐÅ¶©ÔÄºÅ[" + dingyuehao + "]";
    }
}