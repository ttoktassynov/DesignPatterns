package stuctural_patterns.flyweight;

public class Hunter {
    public static void main(String [] args){
        System.out.println("Shooting with cached bullets");

        Gun shotGun = new ShotGun(8, BulletType.SHOTGUN_BULLET);
        shotGun.loadUncachedBullets();

        shotGun.shoot();
    }
}
