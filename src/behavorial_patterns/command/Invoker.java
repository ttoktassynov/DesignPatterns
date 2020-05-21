package behavorial_patterns.command;

public class Invoker {
    public Command command;
    public Invoker(Command command){
        this.command = command;
    }
    public void setCommand(Command command){
        this.command = command;
    }
    public void executeCommand(){
        this.command.execute();
    }
    public void undoCommand(){
        this.command.undo();
    }
}
