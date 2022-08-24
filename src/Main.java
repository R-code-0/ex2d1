import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        method1("Асан");
        System.out.println();
        method1("Усон");
        System.out.println();
        method1("Адыл");
        System.out.println();
        method1("User");
        Cat cat = new Cat(1211,0,0,"z",false);
        Airplane airplane = new Airplane(126811,0,"x","z");
        System.out.println();
        System.out.println();
        method2();
    }
    public static void method1(String name){
        Person asan = new Person("Асан", 30, 0, new AbstractAnimal[]{
                new Cat(1, 3, 2222, "Murka", true),
                new Dog(2, 7, 7500, "Rex", true),
                new Eagle(3, 4, 4567, "Eag1", true),
                new Eagle(4, 3, 2567, "Eag2", true),
                new Eagle(5, 5, 7567, "Eag3", true),
                new Eagle(6, 6, 8567, "Eag4", true),
                new Eagle(7, 4, 5567, "Eag5", true),
                new WhiteSwan(8, 4, 5567, "qwerty", true),
                new WhiteSwan(9, 4, 5567, "qwe", true),
                new Bird(10, 4, 5567, "bird1", true),
                new Bird(11, 4, 5567, "bird2", true),
                new Bird(12, 4, 5567, "bird3", true)}, new AbstractTechnique[]{
                        new Airplane(13, 2018, "Express", "Jet"),
                new Airplane(15, 2020, "Express2", "Jet"),
                new Bayraktar(16, 2021, "Mk", "MKXV")});

        Person uson = new Person("Усон", 30, 17, new AbstractAnimal[]{
                new Cat(18, 3, 2222, "Murka", true),
                new Dog(19, 7, 7500, "Rex", true),
                new Dog(20, 7, 7500, "Rex", true),
                new Eagle(21, 3, 2567, "Eag2", true),
                new Eagle(22, 5, 7567, "Eag3", true),
                new Eagle(23, 6, 8567, "Eag4", true),
                new Eagle(24, 4, 5567, "Eag5", true),
                new WhiteSwan(25, 4, 5567, "qwerty", true),
                new WhiteSwan(26, 4, 5567, "qwe", true),
                new Bird(27, 4, 5567, "bird1", true),
                new Bird(28, 4, 5567, "bird2", true),
                new Bird(29, 4, 5567, "bird3", true)}, new AbstractTechnique[]{
                new Tank(30, 2018, "Express", "Jet"),
                new Tank(31, 2020, "Express2", "Jet"),
                new Tank(32, 2020, "Express2", "Jet"),
                new Helicopter(33, 2021, "M2k", "MKXV"),
                new Helicopter(34, 2021, "Mk3", "MKXV"),
                new Helicopter(35, 2021, "Mk4", "MKXV"),
                new Helicopter(36, 2021, "Mk5", "MKXV"),
                new Helicopter(37, 2021, "Mk9", "MKXV"),
        });

        Person adyl = new Person("Адыл", 30, 38, new AbstractAnimal[]{
                new Cat(39, 3, 2222, "Murka", true),
                new Cat(40, 7, 7500, "Rex", true),
                new Dog(41, 7, 7500, "Rex", true),
                new Eagle(42, 3, 2567, "Eag2", true),
                new Eagle(43, 5, 7567, "Eag3", true),
                new Eagle(44, 6, 8567, "Eag4", true),
                new Eagle(45, 4, 5567, "Eag5", true),
                new Eagle(46, 4, 5567, "qwerty", true),
                new Eagle(47, 4, 5567, "qwe", true),
                new WhiteSwan(418, 4, 5567, "b4441", true),
                new WhiteSwan(428, 4, 5567, "b6d2", true),
                new WhiteSwan(438, 4, 5567, "001d3", true),
                new WhiteSwan(448, 4, 5567, "b344", true),
                new WhiteSwan(458, 4, 5567, "465", true),
                new Bird(49, 4, 5567, "bird1", true),
                new Bird(50, 4, 5567, "bird2", true)}, new AbstractTechnique[]{
                new Sidan(53, 2020, "Express2", "Jet"),
                new Bayraktar(54, 2021, "Mk", "MKXV")
        });
        switch (name){
//            case "Асан"-> System.out.println("Asan's stuff: "+Arrays.toString(Asan.getAnimals()) + Arrays.toString(Asan.getTechniques()));
            case "Асан"-> System.out.println(asan);
            case "Усон"-> System.out.println(uson);
            case "Адыл"-> System.out.println(adyl);
            default -> System.out.println("Мындай адам жок: " + name);
        }
    }

    public static void method2(){
        Airplane airplane = new Airplane(123,2019,"hjj","00");
        Bayraktar bayraktar = new Bayraktar(1501,2020,"hjj","00");
        Helicopter helicopter = new Helicopter(1446,2020,"hjj","00");
        Sidan sidan = new Sidan(2331,2020,"hjj","00");
        Tank tank = new Tank(4621,2020,"hjj","00");
        Bird bird = new Bird(15324,4,2222,"asd",true);
        Cat cat = new Cat(156634,4,2222,"asd",true);
        Dog dog = new Dog(153124,4,2222,"asd",true);
        Eagle eagle = new Eagle(3301534,4,2222,"asd",true);
        WhiteSwan whiteSwan = new WhiteSwan(1114534,4,2222,"asd",true);
        AbstractAnimal[] animals = new AbstractAnimal[]{cat,bird,dog,eagle,whiteSwan};
        AbstractTechnique[] techniques = new AbstractTechnique[]{airplane,bayraktar,helicopter,sidan,tank};
        AbstractAnimal[] flyableanim = new AbstractAnimal[animals.length];
        byte itfa=0;
        AbstractAnimal[] unflyableanim = new AbstractAnimal[animals.length];
        byte ita=0;
        AbstractTechnique[] flyabletech = new AbstractTechnique[techniques.length];
        byte itft=0;
        AbstractTechnique[] unflyabletech = new AbstractTechnique[techniques.length];
        byte itt=0;
        for (AbstractTechnique t : techniques) {
            if (t instanceof CanDo) {
                flyabletech[itft] = t;
                itft++;
            }
            else {
                unflyabletech[itt] = t;
                itt++;
            }
        }
        for (AbstractAnimal a : animals) {
            if (a instanceof CanDo) {
                flyableanim[itfa] = a;
                itfa++;
            }
            else {
                unflyableanim[ita] = a;
                ita++;
            }
        }
        System.out.println("Flyable anims: " + Arrays.toString(flyableanim));
        System.out.println("\nUnflyable anims: "+Arrays.toString(unflyableanim));
        System.out.println("\nFlyable techs: "+Arrays.toString(flyabletech));
        System.out.println("\nUnflyable techs: "+Arrays.toString(unflyabletech));
    }
}