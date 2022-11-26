package task;

public class ArmorDestroyer extends BattleUnitBase {
    public ArmorDestroyer(String unitName, int maxHealth, int baseStrength, int maxArmor) {
        super(unitName, maxHealth, baseStrength, maxArmor);
    }

    @Override
    public void specialAbility(BattleUnit[] ownTeam, BattleUnit[] enemyTeam) {
        int previousArmor = Integer.MIN_VALUE, index = 0;

        for (int i = 0; i < enemyTeam.length; i++) {
            if (enemyTeam[i].health() <= 0) continue;

            final int enemyArmor = enemyTeam[i].armor();

            if (enemyArmor > previousArmor) {
                previousArmor = enemyArmor;
                index = i;
            }
        }

        final BattleUnit enemy = enemyTeam[index];

        if (enemy.armor() > 0) {
            enemy.damageArmor(2 * this.strength() );
        } else
            enemy.takeDamage(Math.max(this.strength() / 4, 1) );
    }

    @Override
    public void attack(BattleUnit other) {
        if (other.armor() > 0) {
            other.takeDamage(Math.max(this.strength() / 4, 1) );
            other.damageArmor(this.strength() );
        } else
            other.takeDamage(Math.max(this.strength() / 2, 1) );
    }
}

