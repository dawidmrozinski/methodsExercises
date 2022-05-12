package klasawewnetrzna;
public class InnerAndOuterStaticMain {
    public static void main(String[] args) {
        MyOuterStaticClass myOuterStaticClass = new MyOuterStaticClass();
        MyOuterStaticClass.MyInnerStaticClass myInnerStaticClass = new MyOuterStaticClass.MyInnerStaticClass();
        MyOuterStaticClass.MyInnerStaticClass myInnerStaticClass1 = myOuterStaticClass.init();
        int calc = (10 * MyOuterStaticClass.myValue);
        System.out.println(calc);
    }


}
