package stuctural_patterns.decorator.file_reader;

public class ClientDemo {
    public static void main(String [] args){
        Reader fileReader =
                new FileReader("C:/test.txt");
        fileReader.read();

        System.out.println("=========");
        System.out.println();

        Reader compressedFileReader =
                new CompressedFileReader(fileReader);
        compressedFileReader.read();

        System.out.println("=========");
        System.out.println();

        Reader encryptedFileReader =
                new EncryptedFileReader(fileReader);
        encryptedFileReader.read();

        System.out.println("=========");
        System.out.println();

        Reader encCompFileReader =
                new EncryptedFileReader(
                        new CompressedFileReader(
                                new FileReader("C:/text2.txt")
                        )
                );
        encCompFileReader.read();
    }
}
