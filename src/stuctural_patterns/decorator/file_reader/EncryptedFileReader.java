package stuctural_patterns.decorator.file_reader;

public class EncryptedFileReader extends ReadDecorator{

    public EncryptedFileReader(Reader reader){
        super(reader);
    }
    @Override
    public void read() {
        System.out.println("De-crypting the file..");
        reader.read();
    }
}
