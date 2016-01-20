/**
 * Created by Yulong on 1/13/2016.
 */
public class Test {
    private static Statistic s;

    public static void main(String[] params) {
        s = new Statistic();

        double a = .55;
        double b = .35;

        // System.out.println(s.getIntersection(a, b));
        // System.out.println(s.getUnion(a, b));
        // System.out.println(s.getComplement(s.getUnion(a, b)));
        // System.out.println("Independent: " + s.isIndependent(a, b));
        // System.out.println("ME: " + s.isMutuallyExclusive(.23, .76));


        int[] data = {62, 65, 68, 68, 68, 69, 71, 73, 74, 77, 82};
        // getData(data);
        int[] data2 = {21, 29, 31, 33, 44, 47, 51, 68};
        double percentileValue = s.getPercentileValue(data2, 50);
        System.out.println("Value: " + percentileValue);
        double percentage = s.getPercentile(data2, 60);
        System.out.println("Percentile: " + percentage + "%");
    }

    private static void getData(int[] data) {
        System.out.println("Average: " + s.getAverage(data));
        System.out.println("Variance: " + s.getSampleVariance(data));
        System.out.println("Std: " + s.getSampleStd(data));
        System.out.println("Coefficient of Variation: " + s.getCV(data));
    }
}
