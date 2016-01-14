/**
 * Created by Yulong on 1/13/2016.
 */
public class Test {

    public static void main(String[] params) {
        Statistic s = new Statistic();

        double a = .55;
        double b = .35;

        System.out.println(s.getIntersection(a, b));
        System.out.println(s.getUnion(a, b));
        System.out.println(s.getComplement(s.getUnion(a, b)));
        System.out.println(s.isIndependent(a, b));


        int[] data = {0, 5, 10, 15, 20};
        System.out.println("Std is: " + s.getSampleStd(data));
    }
}
