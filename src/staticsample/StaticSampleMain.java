package staticsample;
import static staticsample.StaticSample.*;

public class StaticSampleMain {
    public static void main(String[] args) {
        int result = StaticSample.calculate(2, 5);
        System.out.println(result);
        System.out.println(calculate(10, 20));
    }

}
