package 双指针.二分查找;

public class Demo4 {
    public static void main(String[] args) {
        double sqrt = new Demo4().sqrt(0.01);
        System.out.println(sqrt);
    }

    public double sqrt(double x) {
        double l = -x, r = x;
        while (r - l > 1e-8) {
            double mid = (r + l) / 2;
            if (mid * mid >= x) {
                r = mid;
            } else {
                l = mid;
            }
        }

        return l;
    }

}
