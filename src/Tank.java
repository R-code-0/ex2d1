public class Tank extends AbstractTechnique{
    public Tank(int id, int year, String name, String model) {
        super(id, year, name, model);
    }

    @Override
    public void oils() {
        System.out.println("Oil using is unknown/high");
    }

    @Override
    public void capacity() {
        System.out.println("Average");
    }
}

