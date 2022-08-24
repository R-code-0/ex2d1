public class Helicopter extends AbstractTechnique implements CanDo{
    public Helicopter(int id, int year, String name, String model) {
        super(id, year, name, model);
    }

    @Override
    public void oils() {
        System.out.println("Helicopter uses oil over average");
    }

    @Override
    public void capacity() {
        System.out.println("Has low capacity/depends on helicopter type");
    }

    @Override
    public void fly() {
        System.out.println("Helicopter can fly fast, but slower than airplane");
    }
}

