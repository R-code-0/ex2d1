import java.util.Arrays;

public class Person {
    AbstractAnimal[] animals;
    AbstractTechnique[] techniques;
    private String name;
    private int age, id;

    public Person(String name, int age, int id, AbstractAnimal[] animals, AbstractTechnique[] techniques) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.animals = animals;
        this.techniques = techniques;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public AbstractAnimal[] getAnimals() {
        return animals;
    }

    public void setAnimals(AbstractAnimal[] animals) {
        this.animals = animals;
    }

    public AbstractTechnique[] getTechniques() {
        return techniques;
    }

    public void setTechniques(AbstractTechnique[] techniques) {
        this.techniques = techniques;
    }

    @Override
    public String toString() {
        return "Person name: %s , age=%d, id=%d, \n animals=%s, \ntechniques=%s".formatted(name, age, id, Arrays.toString(animals), Arrays.toString(techniques));
    }
}
