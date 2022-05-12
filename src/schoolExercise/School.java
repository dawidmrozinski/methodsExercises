package schoolExercise;

public class School {

    private String name;
    private String adres;

    School (String name, String adres){
        this.name = name;
        this.adres = adres;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    void printInfo () {
        System.out.printf("Name [%s], adres [%s]. \n", name, adres);
    }
}
