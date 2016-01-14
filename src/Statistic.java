/**
 * Created by Yulong on 1/13/2016.
 */
public class Statistic {

    public double getComplement(double a) {
        return 1 - a;
    }

    public double getIntersection(double a, double b) {
        return a * b;
    }

    public double getUnion(double a, double b) {
        return a + b - this.getIntersection(a, b);
    }

    public double getConditionalA(double a, double b) {
        return this.getIntersection(a, b) / b;
    }

    public double getConditionalB(double a, double b) {
        return this.getIntersection(a, b) / a;
    }

    public boolean isIndependent(double a, double b) {
        return this.getIntersection(a, b) == a * b;
    }

    public double getAverage(int[] list) {
        int count = 0;
        int sum = 0;
        for (int n : list) {
            sum += n;
            count++;
        }
        return sum / count;
    }

    public double getStd(int[] list)  {
        return Math.sqrt(this.getVariance(list));
    }

    public double getSampleStd(int[] list) {
        return Math.sqrt(this.getSampleVariance(list));
    }

    public double getVariance(int[] list) {
        int count = 0;
        double variance = 0;
        for (int n : list) {
            variance += Math.pow((n - this.getAverage(list)), 2);
            count++;
        }
        return variance / count;
    }

    public double getSampleVariance(int[] list) {
        int count = 0;
        double variance = 0;
        for (int n : list) {
            variance += Math.pow((n - this.getAverage(list)), 2);
            count++;
        }
        return variance / (count - 1);
    }
}
