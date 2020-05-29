package behavorial_patterns.mediator.bad;

public class BadCommunicationDemo {
    public static void main(String [] args){
        College collegeA = new CollegeA();
        College collegeB = new CollegeB();

        collegeA.send(collegeB);
        System.out.println();
        collegeB.send(collegeA);

    }
}
