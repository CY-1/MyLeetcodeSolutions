package 数组.二分查找;

public class Demo1 {
    // 左闭右闭写法 且不能有重复 如果数字重复则返回结果不定
    int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;//左闭右闭版本
        while (left <= right) {
            int mid = left + ((right - left) / 2);//防止溢出 等同于(left + right)/2
            if (nums[mid] > target) {
                right = mid - 1;// target 在左区间，所以[left, middle - 1]
            }
            else if (nums[mid] < target) {
                left = mid + 1;//target 在右区间，所以[middle + 1, right]
            } else {
                return mid;
            }
        }
        return -1;

    }
}
