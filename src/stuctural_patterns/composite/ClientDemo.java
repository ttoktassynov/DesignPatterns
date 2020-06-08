package stuctural_patterns.composite;

public class ClientDemo {
    public static void main(String [] args){
        GiftSurpiseBox giftBoxForJake = new GiftSurpiseBox();
        GiftSurpiseBox giftBoxForMasha = new GiftSurpiseBox();

        GiftSurpiseBox subGiftBoxJake = new GiftSurpiseBox();
        GiftSurpiseBox subGiftBoxMasha = new GiftSurpiseBox();

        Gift giftDoll = new Gift("Toy doll");
        Gift giftPlane = new Gift("Toy plane");

        subGiftBoxJake.add(giftPlane);
        subGiftBoxMasha.add(giftDoll);

        giftBoxForJake.add(subGiftBoxJake);
        giftBoxForMasha.add(subGiftBoxMasha);

        giftBoxForJake.unWrap();
        giftBoxForMasha.unWrap();

    }
}
