package Animals;

public class FlyingBird extends Bird {
    private final String abilityToFly;

    public FlyingBird(String title, int age, String habitat, String abilityToFly) {
        super(title, age, habitat);
        this.abilityToFly = "летает";
    }

    @Override
    public void eat() {
        System.out.println("1) Открой хлебало как можно шире.");
        System.out.println("2) Заглоти, что бы это ни было.");
        System.out.println("3) Закрой хлебало обратно");
    }

    @Override
    public void go() {
        System.out.println("Разгонись, начни махать крыльями и лети, если ты не презренный петух");
    }

    @Override
    public void hunt() {
        System.out.println("Поймай пакет и сожри как в последний раз, особенно если ты чайка");
    }

    public void fly() {
        go();
    }

    @Override
    public String toString() {
        return super.toString()+". Среда обитания - "+getHabitat()+". Как предпочитает двигаться по жизни - "+
                abilityToFly+".";
    }
}
