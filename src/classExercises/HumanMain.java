package classExercises;

import modifiers.Car;

public class HumanMain {
    public static void main(String[] args) {
        Human human1 = new Human("Dawid", "Mrozinski");
        human1.setName("Dawid");
        human1.setSurname("Mrozinski");
        human1.printInfo();

        human1.name = "Daniel";
        human1.surname = "Krakowski";
        human1.printInfo();

        Human human2 = new Human("Karol", "Niemilski");
        human2.setName("Dominik");
        human2.setSurname("Laskowski");
        human2.printInfo();

        Car car = new Car();
        car.setBrand("Nie Golf");
    }
}
