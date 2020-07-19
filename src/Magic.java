public class Magic extends Hero implements Printable {
    private String magicDamage;
    private int magicHit;

    public Magic(String name, int age, String magicDamage, int magicHit) {
        super(name, age);
        this.magicDamage = magicDamage;
        this.magicHit = magicHit;
    }

    @Override
    public void print() {
        System.out.println("Тип героя: " + getName() + "\n Возраст: " + getAge() + "\n Способность: " + magicDamage +
                "\n Сила волшебства: " + magicHit);
    }

    ;
}
