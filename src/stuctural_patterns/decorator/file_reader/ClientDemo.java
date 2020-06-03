package stuctural_patterns.decorator.file_reader;

public class ClientDemo {
    public static void main(String [] args){
        Reader readerSimple = new FileReader("C:/first.java");
        readerSimple.read();
        System.out.println("====");

        Reader readerEncrypted = new EncryptedFileReader(new FileReader("C:/second.io"));
        readerEncrypted.read();
        System.out.println("=====");

        Reader readerCompressed = new CompressedFileReader(new FileReader("C:/third.zip"));
        readerCompressed.read();
        System.out.println("=====");

        Reader readerMixed = new CompressedFileReader(
                new EncryptedFileReader(
                        new FileReader("C:/fourth.zip")
                )
        );
        readerMixed.read();
        System.out.println("======");
    }
}
