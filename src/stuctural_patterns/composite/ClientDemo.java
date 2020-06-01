package stuctural_patterns.composite;

public class ClientDemo {
    public static void main(String [] args){
        GiftSurpiseBox giftBox =
                new GiftSurpiseBox();
        GiftSurpiseBox subGiftBox =
                new GiftSurpiseBox();
        Gift gift = new Gift("Toy car");
        Gift gift2 = new Gift("Toy plane");

        giftBox.add(gift);
        subGiftBox.add(gift2);

        giftBox.add(subGiftBox);
    }
}
