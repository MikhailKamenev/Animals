package Animals;

public class Amphibian extends Animal{
    private boolean legs;
    private String goOrCrawl;

    public boolean isLegs() {
        return legs;
    }

    public String getGoOrCrawl() {
        return goOrCrawl;
    }

    public void setGoOrCrawl(String goOrCrawl) {
        if (goOrCrawl == "ходит"|| goOrCrawl == "прыгает") {
            this.goOrCrawl = goOrCrawl;
            this.legs = true;
        } else if (goOrCrawl == "ползает") {
            this.goOrCrawl = "ползает";
            this.legs = false;
        } else {
            throw new RuntimeException("для определения способа передвижения выберите один из трех вариантов:" +
                    "'ходит', 'прыгает' или 'ползает'");
        }
    }

    public Amphibian(String title, int age, String habitat, String goOrCrawl) {
        super(title, age, habitat);
        if (goOrCrawl == "ходит"|| goOrCrawl == "прыгает") {
            this.goOrCrawl = goOrCrawl;
            this.legs = true;
        } else if (goOrCrawl == "ползает") {
            this.goOrCrawl = "ползает";
            this.legs = false;
        }else {
            throw new RuntimeException("для определения способа передвижения выберите один из трех вариантов:" +
                    "'ходит', 'прыгает' или 'ползает'");}
    }

    @Override
    public void eat() {
        System.out.println("Just swallow");
    }

    @Override
    public void go() {
        if (getHabitat() == "land") {
            System.out.println("Ползи или прыгай. Без вариантов");}
        else if (getHabitat()=="water") {
            System.out.println("Шевели лапками, не тонет только гавно");}
    }

    public void hunt() {
        System.out.println("Тихо подкрадись, тихо сожри. Все гениальное просто");
    }

    @Override
    public String toString() {
        return super.toString()+". Среда обитания - "+getHabitat()+" Как предпочитает двигаться по жизни - "+
                getGoOrCrawl()+".";
    }
}
