package code._4_student_effort._2_OO_Challenge._1_twoFighters;

public class Fighter {
    public String name;
    public int health;
    public int damagePerAttack;

    public Fighter(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }

    public void attack(Fighter opponent){
        opponent.health = opponent.health - this.damagePerAttack;
    }
}
