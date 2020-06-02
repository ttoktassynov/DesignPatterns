package stuctural_patterns.decorator.file_reader;

public class FileReader implements Reader{
    private String filePath;

    public FileReader(String path){
        this.filePath = path;
    }

    @Override
    public void read() {
        System.out.println("Reading file from: " +
                this.filePath);
    }
}
