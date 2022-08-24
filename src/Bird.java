public class Bird extends AbstractAnimal implements CanDo{
    public Bird(int id, int age, int weight, String name, boolean domesticAnimal) {
        super(id, age, weight, name, domesticAnimal);
    }

    @Override
    public void run() {
        System.out.println("Slow running");
    }

    @Override
    public void eats() {
        System.out.println("Eats small things");
    }

    @Override
    public void HeLive() {
        System.out.println("Living in nature and in cities");
    }

    @Override
    public void fly() {
        System.out.println("Can fly in low distance");
    }
}
