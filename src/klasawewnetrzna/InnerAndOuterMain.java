package klasawewnetrzna;

public class InnerAndOuterMain {

    public static void main(String[] args) {
        MyOuterClass myOuterClass = new MyOuterClass();
        MyOuterClass.MyInnerClass myInnerClass1 = myOuterClass.init();
        myInnerClass1.printNumber();
        MyOuterClass.MyInnerClass myInnerClass2 = myOuterClass.new MyInnerClass();
        myInnerClass2.printNumber();
    }

}
