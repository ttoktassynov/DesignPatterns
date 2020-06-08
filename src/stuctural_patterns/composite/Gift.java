package stuctural_patterns.composite;

public class Gift implements SurpriseBox{ //leaf
    private String giftName;
    public Gift(String name){
        this.giftName = name;
    }

    @Override
    public void unWrap() {
        System.out.println("Unwrapping the gift with name " + this.giftName);
    }
}
