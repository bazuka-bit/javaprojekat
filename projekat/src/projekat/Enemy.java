package projekat;


public class Enemy extends GameObject {
    private String type;
    private int damage;
    private int health;

    public Enemy(int x, int y, int width, int height,
                 String type, int damage, int health) {
        super(x, y, width, height);
        setType(type);
        setDamage(damage);
        setHealth(health);
    }

    public String getType() { return type; }
    public int getDamage() { return damage; }
    public int getHealth() { return health; }

    public void setType(String type) {
        if (type != null && !type.trim().isEmpty())
            this.type = type.trim();
        else
            this.type = "Unknown";
    }

    public void setDamage(int damage) {
        if (damage >= 0 && damage <= 100)
            this.damage = damage;
    }

    public void setHealth(int health) {
        if (health >= 0 && health <= 100)
            this.health = health;
    }

    public String toString() {
        return "Enemy[" + type + "] @ (" +
               getX() + "," + getY() + ") " +
               getWidth() + "x" + getHeight() +
               " DMG=" + damage + " HP=" + health;
    }
}

