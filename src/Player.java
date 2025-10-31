public class Player {
    private String name;
    private int hp;
    private int gold;
    private int level;
    private int xp;
    private double attack;

    public double getAttack() {
        return attack;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Player(String name, int hp, int gold, int level, int xp, double attack) {
        this.name = name;
        this.hp = hp;
        this.gold = gold;
        this.level = level;
        this.xp = xp;
        this.attack = attack;
    }

    public void heal(int amount) {
        this.hp += amount;
    }

    public void levelUp() {
        System.out.println("Congratulations! You've reached level " + (this.level + 1) + "!");
        this.level += 1;
        this.hp += 10;
        this.attack += 2.5;
        this.xp = 0;
    }

    public void takeDamage(int damage) {
        this.hp -= damage;
    }

    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(this.attack);
    }

}
