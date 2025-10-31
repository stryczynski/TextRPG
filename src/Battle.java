public class Battle {
    public void fight(Player player, Enemy enemy) {
        System.out.println("Hostile " + enemy.getName() + " appeared!");
        while (player.getHp() > 0 && enemy.getHp() > 0) {
            player.attackEnemy(enemy);
            System.out.println("You dealt " + player.getAttack() + " damage to " + enemy.getName() + ".");
            if (enemy.getHp() <= 0 ) {
                System.out.println("You defeated " + enemy.getName() + "!");
                break;
            } else {
                System.out.println(enemy.getName() + " have now " + enemy.getHp() + " HP.");
            }
            enemy.attack(player);
            if (player.getHp() <= 0 ) {
                System.out.println("You have been defeated by " + enemy.getName() + "...");
                break;
            } else {
                System.out.println("You now have " + player.getHp() + " HP.");
            }
        }
    }
}
