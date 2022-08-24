public class Bayraktar extends AbstractTechnique{
    public Bayraktar(int id, int year, String name, String model) {
        super(id, year, name, model);
    }

    @Override
    public void oils() {
        System.out.println("Uses much oil/depends");
    }

    @Override
    public void capacity() {
        System.out.println("Average");
    }
}

