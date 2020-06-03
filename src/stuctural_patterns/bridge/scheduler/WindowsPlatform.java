package stuctural_patterns.bridge.scheduler;

public class WindowsPlatform implements Platform{
    @Override
    public void build() {
        System.out.println("Built on Windows");
    }
}
