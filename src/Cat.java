public class Cat extends AbstractAnimal{
    public Cat(int id, int age, int weight, String name, boolean domesticAnimal) {
        super(id, age, weight, name, domesticAnimal);
    }

    @Override
    public void run() {
        System.out.println("Can run fast");
    }

    @Override
    public void eats() {
        System.out.println("eats mouse and eatables");
    }

    @Override
    public void HeLive() {
        System.out.println("Can live in home or in nature");
    }
}
