/**
 * Created by Yulong on 1/13/2016.
 */
public class Test {
    private static Statistic s;

    public static void main(String[] params) {
        s = new Statistic();

        double a = .55;
        double b = .35;

        System.out.println(s.getIntersection(a, b));
        System.out.println(s.getUnion(a, b));
        System.out.println(s.getComplement(s.getUnion(a, b)));
        System.out.println(s.isIndependent(a, b));


        int[] data = {62, 65, 68, 68, 68, 69, 71, 73, 74, 77, 82};
        getData(data);
    }

    private static void getData(int[] data) {
        System.out.println("Average: " + s.getAverage(data));
        System.out.println("Variance: " + s.getSampleVariance(data));
        System.out.println("Std: " + s.getSampleStd(data));
        System.out.println("Coefficient of Variation: " + s.getCV(data));

    }
}
