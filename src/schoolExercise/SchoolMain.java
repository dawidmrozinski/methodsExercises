package schoolExercise;

public class SchoolMain {

    public static void main(String[] args) {
        School school1 = new School("SP4", "ul. rawicka 12/14");
        System.out.println(school1.getAdres());
        school1.printInfo();
    }

}
