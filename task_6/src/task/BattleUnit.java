package task;

public class BattleUnit {
    private final int strenght;

    private final int armor;

    private  int health;

    private  int x;

    private  int y;

    public BattleUnit(int strenght, int armor, int health, int x, int y) {
        this.strenght = strenght;
        this.armor = armor;
        this.health = health;
        this.x = x;
        this.y = y;
    }

    public int getStrength() {
        return this.strenght;
    }

    public int getArmor() {
        return this.armor;
    }

    public int getHealth() {
        return this.health;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void attacked(BattleUnit enemy) {
        this.health -= Math.max(enemy.strenght - Math.max(this.armor,0), 0);
    }
    public void moveUp() {
        this.y -= 1;
    }
    public void moveDown() {
        this.y += 1;
    }
    public void moveLeft() {
        this.x -= 1;
    }
    public void moveRight() {
        this.x += 1;
    }

    public boolean isAlive() {
        return this.health > 0;
    }
}
