public abstract class AbstractAnimal {
    private int id, age, weight;
    private String name;
    private boolean domesticAnimal;

    public AbstractAnimal(int id, int age, int weight, String name, boolean domesticAnimal) {
        this.id = id;
        setAge(age);
        this.weight = weight;
        setName(name);
        this.domesticAnimal = domesticAnimal;
    }

    @Override
    public String toString() {
        return "%s name='%s, id=%d, age=%d, weight=%d, domestic=%s\n".formatted(getClass().getSimpleName(),name, id, age, weight, domesticAnimal);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) this.age = age;
        else System.out.println("Терс сан берүүгө болбойт.");
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() <= 2) System.out.println("Атын туура эмес берип жатасыз 2 тамгадан жогору бериңиз");
        else this.name = name;
    }

    public boolean isDomesticAnimal() {
        return domesticAnimal;
    }

    public void setDomesticAnimal(boolean domesticAnimal) {
        this.domesticAnimal = domesticAnimal;
    }

    public abstract void run();

    public abstract void eats();

    public abstract void HeLive();
}
