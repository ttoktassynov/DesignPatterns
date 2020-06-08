package stuctural_patterns.decorator.file_reader;

public class ClientDemo {
    public static void main(String [] args){
        Reader readerSimple = new FileReader("C:/first.java");
        readerSimple.read();
        System.out.println("====");

        Reader readerCompressed = new CompressedReadDecorator(
                new FileReader("C:/second.zip")
        );
        readerCompressed.read();
        System.out.println("====");

        Reader readerEncrypted = new EncryptedReadDecorator(
                new FileReader("C:/third.abc")
        );
        readerEncrypted.read();
        System.out.println("====");

        Reader mixedReader = new EncryptedReadDecorator(
                new CompressedReadDecorator(
                        new FileReader("C:/fourth.zip.xyz")
                )
        );
        mixedReader.read();
        System.out.println("====");
    }
}
