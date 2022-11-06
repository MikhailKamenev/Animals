package Animals;

public abstract class Bird extends Animal{

    public Bird(String title, int age, String habitat) {
        super(title, age, habitat);
    }

    public abstract void hunt();
}
