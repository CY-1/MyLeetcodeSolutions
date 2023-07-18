package 数组.二分查找;

public class Demo2 {
    // 左闭右开写法 且不能有重复 如果数字重复则返回结果不定
    int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length;//左闭右开版本
        while (left < right) {//因为left == right的时候，在[left, right)是无效的空间，所以使用 <
            int mid = left + ((right - left) / 2);
            if (nums[mid] > target) {
                right = mid;
            }
            else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;

    }
}
