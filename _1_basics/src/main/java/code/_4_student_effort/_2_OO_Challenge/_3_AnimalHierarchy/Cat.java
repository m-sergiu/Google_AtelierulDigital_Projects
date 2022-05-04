package code._4_student_effort._2_OO_Challenge._3_AnimalHierarchy;

public class Cat extends Animal implements Pet{
    String name;

    public Cat( String name) {
        super(4);
        this.name = name;
    }

    public Cat() {
        this("");
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
        System.out.println("cat " + name + " is playing");
    }

    @Override
    public void eat() {
        System.out.println("cat " + name + " is eating");
    }
}
