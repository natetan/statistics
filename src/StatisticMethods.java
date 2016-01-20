/**
 * Created by Yulong on 1/13/2016.
 */
public interface StatisticMethods {
    public double getComplement(double a);

    public double getIntersection(double a, double b);

    public double getUnion(double a, double b);

    public double getConditionalA(double a, double b);

    public double getConditionalB(double a, double b);

    public boolean isIndependent(double a, double b);

    public boolean isMutuallyExclusive(double a, double b);

    public double getAverage(int[] list);

    public double getStd(int[] list);

    public double getSampleStd(int[] list);

    public double getVariance(int[] list);

    public double getSampleVariance(int[] list);

    public double getCV(int[] list);

    public double getPercentileValue(int[] list, int percent);

    public double getPercentile(int[] list, int targetValue);
}
