package klasawewnetrzna;

public class MyOuterStaticClass {
    static int myValue = 100;
    public static class MyInnerStaticClass {

    }

    public MyInnerStaticClass init(){
        return new MyInnerStaticClass();
    }
}
