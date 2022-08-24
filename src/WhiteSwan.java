public class WhiteSwan extends AbstractAnimal implements CanDo{
    public WhiteSwan(int id, int age, int weight, String name, boolean domesticAnimal) {
        super(id, age, weight, name, domesticAnimal);
    }

    @Override
    public void run() {
        System.out.println("WhiteSwan runs slow");
    }

    @Override
    public void eats() {
        System.out.println("WhiteSwan can eat small things");
    }

    @Override
    public void HeLive() {
        System.out.println("WhiteSwan is living in lake");
    }

    @Override
    public void fly() {
        System.out.println("WhiteSwan can fly slow");
    }
}
