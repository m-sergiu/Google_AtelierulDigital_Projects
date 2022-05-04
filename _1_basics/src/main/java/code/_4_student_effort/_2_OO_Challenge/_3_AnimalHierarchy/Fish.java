package code._4_student_effort._2_OO_Challenge._3_AnimalHierarchy;

public class Fish extends Animal implements Pet{
    private String name;

    public Fish() {
        super(0);
    }

    @Override
    public void eat() {
        System.out.println("Fish " + name + " eats");
    }
    @Override
    public void walk() {
        System.out.println("fish cannot walk");
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("fish is playing");
    }
}
