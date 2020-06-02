package stuctural_patterns.decorator.file_reader;

public class CompressedFileReader extends ReadDecorator {

    public CompressedFileReader(Reader reader){
        super(reader);
    }

    @Override
    public void read() {
        System.out.println("Decompressing the file");
        this.reader.read();
    }
}
