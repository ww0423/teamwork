interface Commands{
    void execute();
    void undo();
}
class ConcreteCommand implements Commands{


    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action();
    }
    @Override
    public void undo() {
        receiver.undo();
    }

}

class Invoker{

    private Commands cmd;

    public Invoker(Commands cmd) {
        this.cmd = cmd;
    }
    public void action(){
        cmd.execute();
    }
    public void undo(){
        cmd.undo();
    }
}

class Receiver{
    public Receiver() {
    }
    public void action(){
        System.out.println("do it");
    }
    public void undo(){
        System.out.println("undo it");
    }
}

public class command {
    public static void main(String[] args) {
        Receiver employee=new Receiver();
        Commands cmd1=new ConcreteCommand(employee);
        Invoker boss=new Invoker(cmd1);
        boss.action();
        boss.undo();
    }
}

