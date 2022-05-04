package code._4_student_effort.Challenge6_Builder;



public class Main {
    public static void main(String[] args) {

       Person person01 = new Person.Builder("Mihai")
               .job("Java")
               .build();
    }
}
