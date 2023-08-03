package 双指针.二分查找;

public class Demo4 {
    public static void main(String[] args) {
        double sqrt = new Demo4().sqrt(4);
        System.out.println(sqrt);
    }

    public double sqrt(double x) {
        double l = 0, r = x;
        while (r - l > 1e-8) {
            double mid = (r + l) / 2;
            System.out.println(mid);
            if (mid * mid >= x) {
                r = mid;
            } else {
                l = mid;
            }
        }

        return l;
    }

}
