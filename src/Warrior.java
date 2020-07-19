public class Warrior extends Hero implements Printable{
    private int damage;
    private String superHit;

    public Warrior(String name, int age, int damage, String superHit) {
        super(name, age);
        this.damage = damage;
        this.superHit = superHit;
    }

    @Override
    public void print() {
        System.out.println("Тип героя: " + getName() + "\n Возраст: " + getAge()
                + "\n Сила урона: " + damage + "\n Способность: " + superHit);
    }
}
