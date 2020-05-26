package behavorial_patterns.visitor;

public abstract class ChessComponent {
    private String name;
    public ChessComponent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void accept(Visitor visitor);
}
