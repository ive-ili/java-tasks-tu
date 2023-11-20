import java.util.HashSet;
import java.util.LinkedList;

public class Game {
    private HashSet<Character> characters;
    private HashSet<Monster> monsters;
    private LinkedList<Item> items;

    public Game() {
        this.characters = new HashSet<>();
        this.monsters = new HashSet<>();
        this.items = new LinkedList<>();
    }

    public void addCharacter(Character character) {
        characters.add(character);
    }

    public void removeCharacter(Character character) {
        characters.remove(character);
    }

    public void addMonster(Monster monster) {
        monsters.add(monster);
    }

    public void removeMonster(Monster monster) {
        monsters.remove(monster);
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public void attack(Character attacker, Monster target) {
        int damageDealt = attacker.attack(target);
        target.receiveDamage(damageDealt);

        // Simulate dropping an item with a 20% chance
        if (Math.random() < 0.2) {
            Item newItem = new Item("Powerful Sword", "Damage +10");
            items.add(newItem);
            System.out.println(target.getName() + " dropped " + newItem.getName() + "!");
        }
    }

    public void collectItem(Character character, Item item) {
        System.out.println(character.getName() + " collected " + item.getName() + ". " + item.getAttributeBoost());
        applyAttributeBoost(character, item);
        items.remove(item);
    }

    private void applyAttributeBoost(Character character, Item item) {
        String attributeBoost = item.getAttributeBoost();
        if (attributeBoost.contains("Health")) {
            int healthBoost = extractBoostValue(attributeBoost);
            character.setHealth(character.getHealth() + healthBoost);
        } else if (attributeBoost.contains("Damage")) {
            int damageBoost = extractBoostValue(attributeBoost);
            character.setDamage(character.getDamage() + damageBoost);
        }
    }

    private int extractBoostValue(String attributeBoost) {
        String[] parts = attributeBoost.split("\\s+");
        return Integer.parseInt(parts[1]);
    }

    public void displayGameState() {
        System.out.println("Current Game State:");
        System.out.println("Characters:");
        for (Character character : characters) {
            System.out.println("- Name: " + character.getName() + ", Health: " + character.getHealth() +
                    ", Damage: " + character.getDamage() + ", Level: " + character.getLevel());
        }

        System.out.println("Monsters:");
        for (Monster monster : monsters) {
            System.out.println("- Name: " + monster.getName() + ", Health: " + monster.getHealth() +
                    ", Damage: " + monster.getDamage());
        }

        System.out.println("Items:");
        for (Item item : items) {
            System.out.println("- Name: " + item.getName() + ", Attribute Boost: " + item.getAttributeBoost());
        }

        System.out.println("-------------------------------");
    }
}
