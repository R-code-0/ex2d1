public abstract class AbstractTechnique {
    private int id, year;
    private String name, model;

    public AbstractTechnique(int id, int year, String name, String model) {
        this.id = id;
        setYear(year);
        setName(name);
        this.model = model;
    }

    public abstract void oils();

    public abstract void capacity();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >= 2018) this.year = year;
        else System.out.println("Technique эски жаңысын алып келиңиз");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.toUpperCase();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "%s name=%s, id=%d, year=%d , model=%s\n".formatted(getClass().getSimpleName(),name, id, year, model);
    }
}
