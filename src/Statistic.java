/**
 * Created by Yulong on 1/13/2016.
 */
public class Statistic implements StatisticMethods{

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

    public boolean isMutuallyExclusive(double a, double b) {
        return this.getIntersection(a, b) == 0;
    }

    public double getAverage(int[] list) {
        double count = 0;
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

    public double getCV(int[] list) {
        return this.getStd(list) / this.getAverage(list) * 100;
    }

    // Which value is at the given percentile?
    public double getPercentileValue(int[] list, int percent) {
        int index = 0;
        int count = 0;
        for (int num : list) {
            count++;
        }
        index = (int)Math.floor(percent / 100.0 * (count + 1));
        return (list[index - 1] + list[index]) / 2.0;
    }

    // What is the percentile of the target value?
    public double getPercentile(int[] list, int targetValue) {
        int count = 0;
        int size = 0;
        for (int num : list) {
            if (num < targetValue) {
                count++;
            }
            size++;
        }
        return (count / (double)size) * 100;
    }
}
