package stuctural_patterns.composite;

public class ClientDemo {
    public static void main(String [] args){
        GiftSurpiseBox giftBox =
                new GiftSurpiseBox();
        GiftSurpiseBox subGiftBox =
                new GiftSurpiseBox();
        GiftSurpiseBox giftBox2 =
                new GiftSurpiseBox();

        Gift gift = new Gift("Toy car");
        Gift gift2 = new Gift("Toy plane");

        giftBox.add(gift);
        subGiftBox.add(gift2);
        giftBox2.add(subGiftBox);

        System.out.println("Jane's presents:");
        giftBox.unWrap();
        System.out.println("========");

        System.out.println("Jack's presents:");
        giftBox2.unWrap();
        System.out.println("========");


    }
}
