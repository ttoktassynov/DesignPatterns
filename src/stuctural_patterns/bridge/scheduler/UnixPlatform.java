package stuctural_patterns.bridge.scheduler;

public class UnixPlatform implements Platform{
    @Override
    public void build() {
        System.out.println("Built on Unix");
    }
}
