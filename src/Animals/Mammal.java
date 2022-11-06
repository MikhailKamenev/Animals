package Animals;

public abstract class Mammal extends Animal {
//    private String habitat;
    private int speed;

    public Mammal(String title, int age, String habitat, int speed) {
        super(title, age, habitat);
        if (speed < 0) {
            this.speed = Math.abs(speed);
        } else if (speed == 0) {
            this.speed = 10;
        } else {this.speed = speed;}
    }

    public abstract void walk();


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed < 0) {
            this.speed = Math.abs(speed);
        } else if (speed == 0) {
            this.speed = 10;
        } else {this.speed = speed;}
    }
    @Override
    public void go() {
        if (getHabitat() == "land") {
            System.out.println("Встать на ножки, ходить ножками");
        }
        if (getHabitat() == "water") {
            System.out.println("Шевели плавниками, не тонет только гавно");
        }
        if (getHabitat() == "air") {
            System.out.println("Если ты тот редкий случай природы - летающее млекопитающее, " +
                    "то просто упади с ветки, распахни лапы-крылья и лети.");
        } else {
            System.out.println("Выберите доступную среду обитания из предложенных вариантов:" +
                    "land, water, air");//надо доработать код и проверку внести в класс Mammal
        }
    }
}
