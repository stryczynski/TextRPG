public class Battle {
    public void fight(Player player, Enemy enemy) {
        System.out.println("Hostile " + enemy.getName() + " appeared!");
        System.out.println();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("The sleep operation was interrupted.");
        }
        while (player.getHp() > 0 && enemy.getHp() > 0) {
            player.attackEnemy(enemy);
            System.out.println("You dealt " + player.getAttack() + " damage to " + enemy.getName() + ".");
            System.out.println();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("The sleep operation was interrupted.");
            }
            if (enemy.getHp() <= 0 ) {
                System.out.println("You defeated " + enemy.getName() + "!");
                System.out.println();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("The sleep operation was interrupted.");
                }
                player.setXp(player.getXp() + 10);
                player.setGold(player.getGold() + 10);
                System.out.println("You gained 10 XP and 10 Gold.");
                System.out.println();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("The sleep operation was interrupted.");
                }
                if(player.getXp() >= 10) {
                    player.levelUp();
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("The sleep operation was interrupted.");
                }
                break;
            } else {
                System.out.println(enemy.getName() + " have now " + enemy.getHp() + " HP.");
                System.out.println();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("The sleep operation was interrupted.");
                }
            }
            enemy.attack(player);
            System.out.println(enemy.getName() + " dealt " + enemy.getAttack() + " damage to you.");
            System.out.println();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("The sleep operation was interrupted.");
            }
            if (player.getHp() <= 0 ) {
                System.out.println("You have been defeated by " + enemy.getName() + "...");
                System.out.println();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("The sleep operation was interrupted.");
                }
                break;
            } else {
                System.out.println("You now have " + player.getHp() + " HP.");
                System.out.println();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("The sleep operation was interrupted.");
                }
            }
        }
    }
}
