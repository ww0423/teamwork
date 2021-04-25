interface Observer{
    void update();
}
interface Publisher{
    void addnotify();
}
class ConcreteObserver implements Observer{
    private Observer observer;
    public ConcreteObserver(Observer observer) {
        this.observer=observer;
    }
    public void update(){
        observer.update();
    }

}
class ConcretePublisher implements Publisher{

    private ConcreteObserver concreteobserver;

    public ConcretePublisher(ConcreteObserver concreteobserver) {
        this.concreteobserver = concreteobserver;
    }

    @Override
    public void addnotify() {

    }

}


public class subscriber {
    public static void main(String[] args) {
        Observer observer =new Observer() {
            @Override
            public void update() {

            }
        };
        ConcreteObserver observer1 = new ConcreteObserver(observer);
        Publisher publisher =new ConcretePublisher(observer1);
        publisher.addnotify();
        observer1.update();
    }
}