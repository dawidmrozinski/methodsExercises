package classExercises;

public class Human {
    String name;
    String surname;

    Human (String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public void  setName(String name){

        this.name =name;
    }
    public void setSurname(String surname){

        this.surname = surname;
    }

    public void printInfo() {
        System.out.printf("Name[%s], surname[%s] \n", name, surname);
    }

}
