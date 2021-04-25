 interface Subject {
    public void requests();
}
 class RealSubject implements Subject{
    private Subject subject;
    public RealSubject(Subject subject){
        this.subject=subject;
    }
    public void requests() {
        System.out.println("finish the request");
    }
}
 class Proxys implements Subject{
     private Subject subject;
     public Proxys(Subject subject){
         this.subject=subject;
     }
    public void requests(){
        RealSubject realsubject = new RealSubject(subject);
        realsubject.requests();

    }

}
public class proxy {

    public static void main(String[] args){
        Subject subject = new Subject() {
            @Override
            public void requests() {

            }
        };
        Subject proxy = new Proxys(subject);
        proxy.requests();
    }

}
