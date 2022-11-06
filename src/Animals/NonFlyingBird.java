package Animals;

public class NonFlyingBird extends Bird{
    private final String abilityToFly;

    public NonFlyingBird(String title, int age, String habitat, String abilityToFly) {
        super(title, age, habitat);
        this.abilityToFly = "не летает";
    }

    @Override
    public void eat() {
        System.out.println("1) Открой хлебало как можно шире.");
        System.out.println("2) Заглоти, что бы это ни было.");
        System.out.println("3) Закрой хлебало обратно");
    }

    @Override
    public void go() {
        System.out.println("Начни махать крыльями и осознай что ты презренный петух");
    }

    @Override
    public void hunt() {
        System.out.println("ATTENTION ONLY FOR PENGUINS");
        System.out.println("Нырни поглубже, поймай рыбу побольше. Постарайся выжить на любом этапе мероприятия.");
    }

    public void walk() {
        go();
    }
    @Override
    public String toString() {
        return super.toString()+". Среда обитания - "+getHabitat()+". Как предпочитает двигаться по жизни - "+
                abilityToFly+".";
    }
}
