package code._4_student_effort._2_OO_Challenge._3_AnimalHierarchy;

public abstract class Animal {
    protected int legs;

    protected  Animal(int legs) {
        this.legs = legs;
    }

    public abstract void eat();

    public void walk(){
        System.out.println("This animal with " + legs+ " legs walks");
    }

}
