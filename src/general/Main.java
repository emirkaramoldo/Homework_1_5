package general;

import templates.Boss;
import templates.Hero;

public class Main {
    public static void main(String[] args) {
            Boss firstBoss = new Boss();
            firstBoss.setHealth(700);
            firstBoss.setDamage(50);
            firstBoss.setDefenceType("Magical");
            System.out.println("Boss health: " + firstBoss.getHealth() + " Boss damage: " + firstBoss.getDamage() +
                    " Boss defence type: " + firstBoss.getDefenceType());

        Hero[] heroes = createHeroes();
        for (Hero hero : heroes) {
            System.out.println(hero);
        }
    }

    public static Hero[] createHeroes() {
        Hero hero1 = new Hero(100, 20, "Fireball");
        Hero hero2 = new Hero(150, 30);
        Hero hero3 = new Hero(200, 40, "Invisibility");

        return new Hero[]{hero1, hero2, hero3};
    }
}