import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercises {

    public static void main(String[] args) {
        System.out.println(substractionInt(10, -11));
        System.out.println(fullName("Dawid", "Mrozinski"));
        System.out.printf("%s \n", fullName("Dawid", "Mrozinski"));
        createTabWith5Index();
        createIrregularofIndexesFullNameTab();

    }

    public static int substractionInt(int x, int y){
        return x - y;
    }

    public static String fullName(String name, String lastName){
        return name + " " + lastName;
    }

    public static void createTabWith5Index(){
        Pattern pattern = Pattern.compile("^[A-Z][a-z]+");

        Scanner in = new Scanner(System.in);
        String[] stringsTab = new String[5];
        for (int i = 0; i < stringsTab.length; i ++) {
            System.out.println("Podaj " + (i + 1) + " imie!");
            String stringFromUser = in.next();
            Matcher matcher = pattern.matcher(stringFromUser);
            if(matcher.matches()) {
                System.out.println("Podales prawidlowe dane!");
                stringsTab[i] = stringFromUser;
            } else {
                System.out.println("Podaj prawidlowe dane!");
                i = i - 1;
            }
        }
        for (int i = 0; i < stringsTab.length; i++){
            System.out.printf("stringsTab[%d] = %s \n", i, stringsTab[i]);
        }
    }

    public static void createIrregularofIndexesFullNameTab(){
        Scanner in = new Scanner(System.in);
        System.out.println("Insert number of indexes of your FULL NAME TAB");
        int numberOfIndexes = in.nextInt();
        String[] fullNameTab = new String[numberOfIndexes];
        Pattern pattern = Pattern.compile("^([A-Z][a-z]+) ([A-Z][a-z]+)$");
        for (int i = 0; i < fullNameTab.length; i ++){
            System.out.println("Insert " + (i + 1) + " name!");
            String fullNameFromUser = in.nextLine();
            Matcher matcher = pattern.matcher(fullNameFromUser);
            if (matcher.matches()){
                System.out.println("You have entered correct data!");
                fullNameTab[i] = fullNameFromUser;
            }else {
                System.out.println("You have entered incorrect data! Please, try again!");
                i = i - 1;
            }

        }
        for (int i = 0; i < fullNameTab.length; i ++){
            System.out.println("Imie nr " + (i + 1) + " = " + fullNameTab[i]);
        }
    }

}
