package stuctural_patterns.decorator.file_reader;

public class CompressedReadDecorator extends ReadDecorator {
    public CompressedReadDecorator(Reader reader) {
        super(reader);
    }
    @Override
    public void read() {
        System.out.println("Decompressed the file!");
        this.reader.read();
    }
}
