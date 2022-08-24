public class Dog extends AbstractAnimal{
    public Dog(int id, int age, int weight, String name, boolean domesticAnimal) {
        super(id, age, weight, name, domesticAnimal);
    }

    @Override
    public void run() {
        System.out.println("Can run fast");
    }

    @Override
    public void eats() {
        System.out.println("Eats meat and bones, and other");
    }

    @Override
    public void HeLive() {
        System.out.println("Lives in home or in nature");
    }
}
