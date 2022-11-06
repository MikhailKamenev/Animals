package Animals;

import java.util.Objects;

public abstract class Animal {
    private final String title;
    private int age;
    private final String habitat;

    public Animal(String title, int age, String habitat) {
        if (title != null || !title.isEmpty() || !title.isBlank()) {
            this.title = title;}
        else {this.title = "nick";}
        if (age < 0) {
            this.age = Math.abs(age);
        } else if (age == 0) {
            this.age++;
        } else {this.age = age;}
        if (habitat != null || !habitat.isEmpty() || !habitat.isBlank()) {
            this.habitat = habitat;}
        else {this.habitat = "land";}
    }

    public abstract void eat();
    public abstract void go();
    public void sleep() {
        System.out.println("Закрыть глазки==>уснуть==>проснуться==>открыть глазки");
    }

    @Override
    public String toString() {
        return "Название животного - "+getTitle()+". Возраст - "+getAge()+" лет.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return getAge() == animal.getAge() && Objects.equals(getTitle(), animal.getTitle());
    }

    public String getTitle() {
        return title;
    }


    public int getAge() {
        return age;
    }

    public String getHabitat() {
        return habitat;
    }
    //    }
//        else {this.habitat = "land";}
//            this.habitat = habitat;}
//        if (habitat != null || !habitat.isEmpty() || !habitat.isBlank()) {
//    public void setHabitat(String habitat) {
//    }
//        } else {this.age = age;}
//            this.age++;
//        } else if (age == 0) {
//            this.age = Math.abs(age);
//        if (age < 0) {
//    public void setAge(int age) {
//    public void setTitle(String title) {
//        if (title != null || !title.isEmpty() || !title.isBlank()) {
//            this.title = title;}
//        else {this.title = "nick";}
//    }
}