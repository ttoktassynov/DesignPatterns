package stuctural_patterns.flyweight;

public enum BulletType {
    PISTOL_BULLET("MG 45 bullet"),
    SHOTGUN_BULLET("Cogey 84 Bullet"),
    SNIPER_BULLET("M 14 Bullet");

    private String name;

    BulletType(String name){
        this.name = name;
    }
}
