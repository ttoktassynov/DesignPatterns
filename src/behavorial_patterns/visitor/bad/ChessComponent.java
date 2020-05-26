package behavorial_patterns.visitor.bad;

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

    public abstract void visit();
}
