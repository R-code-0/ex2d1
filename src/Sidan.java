public class Sidan extends AbstractTechnique{
    public Sidan(int id, int year, String name, String model) {
        super(id, year, name, model);
    }

    @Override
    public void oils() {
        System.out.println("Uses less oil than other in here");
    }

    @Override
    public void capacity() {
        System.out.println("Low capacity");
    }
}

