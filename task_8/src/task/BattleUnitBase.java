package task;

public abstract class BattleUnitBase implements BattleUnit{
    protected final String unitName;

    protected int maxHealth, currHealth;
    protected int baseStrength, currStrength;
    protected int maxArmor, currArmor;

    public BattleUnitBase(String unitName, int maxHealth, int baseStrength, int maxArmor) {
        this.unitName = unitName;
        this.currHealth = this.maxHealth = maxHealth;
        this.currStrength = this.baseStrength = baseStrength;
        this.currArmor = this.maxArmor = maxArmor;
    }

    @Override
    public String name() {
        return this.unitName;
    }

    @Override
    public int health() {
        return this.currHealth;
    }

    @Override
    public int maxHealth() {
        return this.maxHealth;
    }

    @Override
    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
        this.currHealth = Math.min(this.currHealth, this.maxHealth);
    }

    @Override
    public void heal(int value) {
        this.currHealth = Math.max(Math.min(this.health() + value, this.maxHealth() ), 0);
    }

    @Override
    public int strength() {
        return this.currStrength;
    }

    @Override
    public void setStrength(int value) {
        this.currStrength = value;
    }

    @Override
    public int baseStrength() {
        return this.baseStrength;
    }

    @Override
    public int armor() {
        return this.currArmor;
    }

    @Override
    public void restoreArmor(int value) {
        this.currArmor = Math.max(Math.min(this.armor() + value, this.maxArmor() ), 0);
    }

    @Override
    public int maxArmor() {
        return this.maxArmor;
    }

    @Override
    public void setMaxArmor(int value) {
        this.maxArmor = value;
        this.currArmor = Math.min(this.currArmor, this.maxArmor);
    }

    @Override
    public abstract void specialAbility(BattleUnit[] ownTeam, BattleUnit[] enemyTeam);

    @Override
    public abstract void attack(BattleUnit other);
}
