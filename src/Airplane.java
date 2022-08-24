public class Airplane extends AbstractTechnique implements CanDo{
    public Airplane(int id, int year, String name, String model) {
        super(id, year, name, model);
    }

    @Override
    public void oils() {
        System.out.println("Airplane uses oil for fly");
    }

    @Override
    public void capacity() {
        System.out.println("Airplane has decent capacity");
    }

    @Override
    public void fly() {
        System.out.println("Airplane flies in air fastest");
    }
}
