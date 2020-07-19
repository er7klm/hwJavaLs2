public class Healer extends Hero implements Printable{
    private int healsSkills;
    private String superHeal;

    public Healer(String name, int age, int healsSkills, String superHeal){
        super(name, age);
        this.healsSkills = healsSkills;
        this.superHeal = superHeal;
    }

    @Override
    public void print() {
        System.out.println("Тип героя: " + getName() + "\n Возраст: " + getAge() + "\n Повышение жизни на (пунктов): "
                + healsSkills + "\n Спобность: " + superHeal);
    }
}
