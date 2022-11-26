package task;

public interface BattleUnit {
    String name();

    int health();

    int maxHealth();

    void setMaxHealth(int value);

    void heal(int value);

    default void takeDamage(int value) {
        // лечение в отрицательную сторону
        this.heal(-value);
    }

    int strength();

    void setStrength(int value);

    int baseStrength();

    int armor();

    void restoreArmor(int value);

    default void damageArmor(int value) {
        // восстановление брони в отрицательную сторону
        this.restoreArmor(-value);
    }

    int maxArmor();

    void setMaxArmor(int value);

    void specialAbility(BattleUnit[] ownTeam, BattleUnit[] enemyTeam);

    void attack(BattleUnit other);
}
