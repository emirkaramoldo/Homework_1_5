package general;

import templates.Boss;

public class Main {
    public static void main(String[] args) {
            Boss firstBoss = new Boss();
            firstBoss.setHealth(700);
            firstBoss.setDamage(50);
            firstBoss.setDefenceType("Magical");
            System.out.println("Boss health: " + firstBoss.getHealth() + " Boss damage: " + firstBoss.getDamage() +
                    " Boss defence type: " + firstBoss.getDefenceType());
    }
}