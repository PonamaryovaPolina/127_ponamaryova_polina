package task;

public class Infantryman extends BattleUnitBase {
    public Infantryman(String unitName, int maxHealth, int baseStrength, int maxArmor) {
        super(unitName, maxHealth, baseStrength, maxArmor);
    }

    @Override
    public void specialAbility(BattleUnit[] ownTeam, BattleUnit[] enemyTeam) {
        // ничего не делает
    }

    @Override
    public void attack(BattleUnit other) {
        if (other.armor() > 0) {
            other.takeDamage(Math.max(this.strength() / 2, 1) );
            other.damageArmor(Math.max(this.strength() / 4, 1) );
        } else
            other.takeDamage(this.strength() );
    }
}

