package projekat;

public class Player extends GameObject {
    private String name;
    private int health;

    public Player(int x, int y, int width, int height,String name, int health) {
        super(x, y, width, height);
        setName(name);
        setHealth(health);
     // TODO Auto-generated constructor stub
    }

    public String getName() { return name; }
    public int getHealth() { return health; }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            this.name = "Unknown";
            return;
        }

        String[] rijeci = name.trim().toLowerCase().split("\\s+");
        String rezultat = "";

        for (String rijec : rijeci) {
            rezultat += rijec.substring(0, 1).toUpperCase()
                      + rijec.substring(1) + " ";
        }

        this.name = rezultat.trim();
    }

    public void setHealth(int health) {
        if (health >= 0 && health <= 100)
            this.health = health;
    }
    

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
               "Type=" + type +
               " DMG=" + damage + " HP=" + health;
    }
}

   
}


