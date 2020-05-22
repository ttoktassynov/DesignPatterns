package behavorial_patterns.command.good;

import java.util.ArrayList;
import java.util.List;

public class CustomerDemo {
    private Invoker invoker;
    private List<Command> commandList;
    public static void main(String [] args){
        CustomerDemo customer = new CustomerDemo();
        customer.run();
    }
    public void run(){
        commandList = new ArrayList<>();

        Receiver receiver = new Light("Bedroom light");
        Command command = new TurnOnCommand(receiver);
        invoker = new Invoker(command);
        commandList.add(command);
        invoker.executeCommand();

        Receiver receiver2 = new Light("Kitchen light");
        Command command2 = new TurnOnCommand(receiver2);
        commandList.add(command2);
        invoker.setCommand(command2);
        invoker.executeCommand();

        System.out.println("Les's now undo all the command:");
        for (Command curCommand : commandList){
            invoker.setCommand(curCommand);
            invoker.undoCommand();
        }

    }

}
