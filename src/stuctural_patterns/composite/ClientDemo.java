package stuctural_patterns.composite;

public class ClientDemo {
    public static void main(String [] args){
        GiftSurpiseBox giftBoxForJake = new GiftSurpiseBox();
        GiftSurpiseBox subGiftBox = new GiftSurpiseBox();
        GiftSurpiseBox subGiftBox2 = new GiftSurpiseBox();
        GiftSurpiseBox giftBoxForMasha = new GiftSurpiseBox();

        Gift giftCar = new Gift("Toy car");
        Gift giftPlane = new Gift("Toy plane");

        giftBoxForJake.add(subGiftBox);
        subGiftBox.add(giftCar);

        giftBoxForMasha.add(subGiftBox2);
        subGiftBox2.add(giftPlane);

        System.out.println("Jake is receiving presents");
        giftBoxForJake.unWrap();
        System.out.println("====");

        System.out.println("Masha is receiving presents");
        giftBoxForMasha.unWrap();
        System.out.println("====");
    }
}
