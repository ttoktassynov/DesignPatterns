package behavorial_patterns.memento;

public class Main {
    public static void main(String [] args){
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setArticle("State 1");
        caretaker.addMemento(originator.save());

        printState(originator);

        originator.setArticle("State 2");
        caretaker.addMemento(originator.save());
        printState(originator);

        originator.restore(caretaker.undo());
        printState(originator);

        originator.restore(caretaker.redo());
        printState(originator);

        originator.setArticle("State 3");
        caretaker.addMemento(originator.save());
        printState(originator);

        originator.setArticle("State 4");
        caretaker.addMemento(originator.save());
        printState(originator);

        originator.setArticle("State 5");
        caretaker.addMemento(originator.save());
        printState(originator);

        originator.setArticle("State 6");
        caretaker.addMemento(originator.save());
        printState(originator);

        originator.restore(caretaker.undo());
        originator.restore(caretaker.undo());
        originator.restore(caretaker.undo());
        printState(originator);




    }
    public static void printState(Originator o){
        System.out.println("Current state: " + o.getArticle());
    }
}
