public class Eagle extends AbstractAnimal implements CanDo{
    public Eagle(int id, int age, int weight, String name, boolean domesticAnimal) {
        super(id, age, weight, name, domesticAnimal);
    }

    @Override
    public void run() {
        System.out.println("Can run unknown");
    }

    @Override
    public void eats() {
        System.out.println("Eagle is predator");
    }

    @Override
    public void HeLive() {
        System.out.println("Eagle is living in high mountains");
    }

    @Override
    public void fly() {
        System.out.println("Can fly in high sky");
    }
}
