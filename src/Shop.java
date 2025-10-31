import java.util.List;
import java.util.ArrayList;

public class Shop {
    private List<String> items;
    private List<Integer> prices;

    public Shop() {
        items = new ArrayList<>();
        prices = new ArrayList<>();

        items.add("Health Potion (+10HP)");
        prices.add(10);

        items.add("Sword (+5 Attack)");
        prices.add(50);
    }

    public void buyItem(Player player, int itemIndex) {
        if (itemIndex < 0 || itemIndex >= items.size()) {
            System.out.println("Invalid item selection.");
            return;
        }

        int price = prices.get(itemIndex);
        String itemName = items.get(itemIndex);

        if (player.getGold() >= price) {
            player.setGold(player.getGold() - price);

            if (itemName.contains("Health Potion")) {
                player.heal(10);
            } else if (itemName.contains("Sword")) {
                player.setAttack(player.getAttack() + 5);
            }

            System.out.println("You bought " + itemName + "! You have " + player.getGold() + " gold left.");
        } else {
            System.out.println("You don't have enough gold to buy " + itemName + ".");
        }
    }
}