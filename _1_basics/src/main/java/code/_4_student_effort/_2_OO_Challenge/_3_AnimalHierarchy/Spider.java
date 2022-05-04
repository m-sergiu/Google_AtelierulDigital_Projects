package code._4_student_effort._2_OO_Challenge._3_AnimalHierarchy;

public class Spider extends Animal{

    public Spider() {
        super(8);
    }

    @Override
    public void eat() {
        System.out.println("Spider eats insects");
    }
}
