package projekat;


public class Main {
    public static void main(String[] args) {

        Player p = new Player(10, 5, 32, 32,
                              "petar petrovic", 85);
        
        Enemy e = new Enemy(12, 5, 16, 16,
                            "Goblin", 20, 60);
        
        MeleeEnemy m = new MeleeEnemy(20, 10, 16, 16,
                                      "Orc", 15, 70);

        BossEnemy b = new BossEnemy(12, 5, 32, 32,
                                    "Goblin King", 25, 100);

        System.out.println(p);
        System.out.println(e);
        System.out.println(m);
        System.out.println(b);

        System.out.println("Collision: " + p.intersects(e));
        System.out.println("Boss dmg taken: " + b.getTotalDamage());
    }
}

