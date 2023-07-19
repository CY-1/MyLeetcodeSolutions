package 双指针.二分查找;
//仿照python的bisect库编写
public class Demo3 {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7};
        System.out.println(new Demo3().search_left(nums, 3));
        System.out.println(new Demo3().search_right(new int[] { 1, 2, 3, 4, 5 }, 0));
    }
    // 左闭右开 如果有重复元素 返回最左边的应该插入的位置 如果没有就返回应该插入的位置
    // 要注意可能返回0到nums.length
    int search_left(int[] nums, int target) {
        int left = 0;
        int right = nums.length; //左闭右开
        while (left < right) {
            int mid = left + ((right - left) / 2);
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    // 如果有重复返回最右边的元素+1的位置 或者查询不到就返回应该插入的位置
//要注意可能返回0到length
    int search_right(int[] nums, int target) {
        int left = 0;
        int right = nums.length;//左闭右开
        while (left < right) {
            int mid = left + ((right - left) / 2);
            if (target<nums[mid]) {
                right = mid;
            }
            else {
                left = mid + 1;
            }
        }
        return left;
    }
    
}
