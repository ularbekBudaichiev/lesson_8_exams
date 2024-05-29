package kg.geeks.game.players;

import kg.geeks.game.logic.RPG_Game;

import java.util.Random;

public class Ludaman extends Hero {
    public Ludaman(int health, int damage, String name, SuperAbility ability) {
        super(health, damage, name, ability);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int dies1;
        Random random1 = new Random();
        dies1 = random1.nextInt(6) + 1;

        int dies2;
        Random random2 = new Random();
        dies2 = random2.nextInt(6) + 1;

        if (dies1 == dies2) {
            boss.setHealth(boss.getHealth() - (dies1 * dies2));
            System.out.println(this.getName() + " dies match,otnimaem " + (dies2 * dies1));
        } else {
            for (int i = 0; i < heroes.length; i++) {


                if (dies1 != dies2) {
                    heroes[i].setHealth(heroes[i].getHealth() - (dies2 + dies1));

                    System.out.println(this.getName() + "dies don't match, otnimaem " + (dies1 + dies2));
                }
            }

        }


    }
}



