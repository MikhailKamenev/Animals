package Animals;

import java.util.Objects;

public class Herbivorous extends Mammal {
    private String typeOfFood;

    public Herbivorous(String title, int age, String habitat, int speed, String typeOfFood) {
        super(title, age, habitat, speed);
        if (typeOfFood != null || !typeOfFood.isEmpty() || !typeOfFood.isBlank()) {
            this.typeOfFood = typeOfFood;
        } else {
            this.typeOfFood = "какя-то травка";
        }
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        if (typeOfFood != null || !typeOfFood.isEmpty() || !typeOfFood.isBlank()) {
            this.typeOfFood = typeOfFood;
        } else {
            this.typeOfFood = "какя-то травка";
        }
    }

    @Override
    public void eat() {
        System.out.println("Откуси "+typeOfFood+". Пожуй "+typeOfFood+".");
    }

    @Override
    public void go() {
        if (Objects.equals(getHabitat(), "land")) {
            System.out.println("Встать на ножки, ходить ножками");}
        else if (getHabitat()=="water") {
            System.out.println("Шевели плавниками, не тонет только гавно");}
        else if (getHabitat() == "air") {
            System.out.println("Если ты тот редкий случай природы - летающее млекопитающее, " +
                    "то просто упади с ветки, распахни лапы-крылья и лети.");}
        else {
            System.out.println("Выберите доступную среду обитания из предложенных вариантов:" +
                    "land, water, air");}//надо доработать код и проверку внести в класс Mammal
    }

    @Override
    public void walk() {
        go();
    }

    public void graze() {
        go();
        eat();
    }
}
