import Animals.*;

public class Main {
    public static void main(String[] args) {
        //Animals
        Predator tiger = new Predator("Tiger", 3, "land", 50, "meat");
        Herbivorous horse = new Herbivorous("Horse", 4, "land", 60, "herb");
        Amphibian frog = new Amphibian("Frog", 2, "land", "прыгает");
        FlyingBird gull = new FlyingBird("Gull", 7, "air", " ");
        NonFlyingBird penguin = new NonFlyingBird("Penguin", 20, "land", "");
        System.out.println(penguin);
        System.out.println(gull);
        System.out.println(tiger.equals(horse));
    }
}