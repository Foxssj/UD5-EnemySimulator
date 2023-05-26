import com.minegame.character.Player;
import com.minegame.mob.hostile.HostileMob;
import com.minegame.mob.hostile.enderman.Enderman;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String weapons = "1. Nothing\n" +
                "2. Wooden sword +2 atk\n" +
                "3. Iron sword +3 atk\n" +
                "4. Diamond sword +4 atk";

        String armors = "1. Nothing\n" +
                "2. Leather armor +2 def\n" +
                "3. Iron armor +3 def\n" +
                "4. Diamond armor +4 def";
        final int DEFAULT_VALUE = 1;
        int weaponChoosed,
                armorChoosed,
                force = DEFAULT_VALUE,
                defense = DEFAULT_VALUE;

        System.out.println("Welcome to MineGame!");
        System.out.println("Which weapon will you use?\n" + weapons);
        weaponChoosed = sc.nextInt();
        System.out.println("and which armor? \n" + armors);
        armorChoosed = sc.nextInt();

        if (weaponChoosed > 1 && weaponChoosed < 5) {
            force += weaponChoosed;
        } else {
            force = 1;
        }
        if (armorChoosed > 1 && armorChoosed < 5) {
            defense += armorChoosed;
        } else {
            defense = 1;
        }
        sc.nextLine();

        Player player = new Player(defense, force);
        HostileMob enemy = new Enderman(14, 6);

        Random random = new Random();

        int totalTurns = 0;

        while (player.getHealth() > 0 && enemy.getHealth() > 0) {
            int randomAction = random.nextInt(4);

            enemy.takeAttack(player.attack());
            if (randomAction > 1) {
                player.takeAttack(enemy.attack());
            } else {
                enemy.movement();
            }
            totalTurns++;
        }

        if (enemy.getHealth() > 0) {
            System.out.println("The fights was " +totalTurns + " turns long and the winner was the enemy");
        } else {
            System.out.println("The fights was " + totalTurns + " turns long and the winner was the Player");
        }
    }
}