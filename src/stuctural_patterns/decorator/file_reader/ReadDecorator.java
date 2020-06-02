package stuctural_patterns.decorator.file_reader;

public abstract class ReadDecorator implements Reader {
    protected Reader reader;

    public ReadDecorator(Reader reader){
        this.reader = reader;
    }
}
