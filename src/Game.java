import java.util.Scanner;

public class Game {
    Player player = new Player("Hero", 100, 0, 1, 0, 10.0);
    public boolean isRunning = true;

    public void start() {
        while (isRunning) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Choose an action:");
            System.out.println("1. Fight");
            System.out.println("2. Shop");
            System.out.println("3. Stats");
            System.out.println("4. Exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Enemy enemy = new Enemy("Goblin", 50, 5);
                    Battle battle = new Battle();
                    battle.fight(player, enemy);
                    break;
                case 2:
                    Shop shop = new Shop();
                    System.out.println("Welcome to the shop! Choose an item to buy:");
                    System.out.println("1. Health Potion (+10HP) - 10 Gold");
                    System.out.println("2. Sword (+5 Attack) - 50 Gold");
                    int itemChoice = scanner.nextInt() - 1;
                    shop.buyItem(player, itemChoice);
                    break;
                case 3:
                    System.out.println("Player Stats:");
                    System.out.println("Name: " + player.getName());
                    System.out.println("HP: " + player.getHp());
                    System.out.println("Gold: " + player.getGold());
                    System.out.println("Level: " + player.getLevel());
                    System.out.println("XP: " + player.getXp());
                    System.out.println("Attack: " + player.getAttack());
                    break;
                case 4:
                    isRunning = false;
                    System.out.println("Exiting game. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}