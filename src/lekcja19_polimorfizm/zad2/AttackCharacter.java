package lekcja19_polimorfizm.zad2;

public class AttackCharacter extends GameCharacter {
    private double extraAttack;

    public AttackCharacter(String name, int energy, int attack, int defense, double extraAttack) {
        super(name, energy, attack, defense);
        this.extraAttack = extraAttack;
    }
}
