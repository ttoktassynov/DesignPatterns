package behavorial_patterns.command;

public class TurnOffCommand implements Command{
    private Receiver receiver;
    public TurnOffCommand(Receiver receiver){
        this.receiver = receiver;
    }
    @Override
    public void execute() {
        receiver.off();
    }

    @Override
    public void undo() {
        receiver.on();
    }
}
