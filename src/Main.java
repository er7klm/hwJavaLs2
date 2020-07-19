public class Main {

    public static void main(String[] args) {
        String[] array = new String[]{Warrior.class.getSimpleName(), Magic.class.getSimpleName(), Healer.class.getSimpleName()};

        for (String heroes: array){
            Hero hero = Main.createObject(heroes);
            hero.print();
        }
    }

    public static Hero createObject(String className){
        Hero hero = null;
        switch (className){
            case "Warrior":
                hero = new Warrior("Воин", 22, 100, "Супер удар");
                break;
            case "Magic":
                hero = new Magic("Волшебник", 48, "Заклинания", 200);
                break;
            case "Healer":
                hero = new Healer("Лекарь", 33, 50, "Лечение");
                break;
        }
        return hero;
    }
}
