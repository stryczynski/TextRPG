public class Enemy {
    private String name;
    private int hp;
    private int attack;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public Enemy(String name, int hp, int attack) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
    }

    public void attack(Player player) {
        player.setHp(player.getHp() - this.attack);
    }

    public void takeDamage(double damage) {
        this.hp -= damage;
    }

    public void isDead() {
        if (this.hp <= 0) {
            System.out.println(this.name + " has been defeated!");
        }
    }
}
