package 排序.快排;

import java.util.Arrays;

public class Example {
    public static void main(String[] args) {
        var a = new int[] { 4, 2, 4 };
        quickSort(a, 0, a.length - 1);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

    }

    public static void quickSort(int[] nums, int start, int end) {
        if (start >= end)
            return;
        else {
            int x = nums[start];
            int i = start - 1;// 把i和j放到边界两侧 便于后期编写
            int j = end + 1;
            while (i < j) {
                do {
                    i++;
                } while (nums[i] < x);
                do {
                    j--;
                } while (nums[j] > x);
                if (i < j) {
                    swap(nums, i, j);
                }
            }

            quickSort(nums, start, j);
            //如果是quickSort(nums, start, j-1); 4 2 4就会报错
            quickSort(nums, j + 1, end);
        }
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
