package leetcode.editor.cn;
 
//给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。 
//
// 
//
// 进阶： 
//
// 
// 尽可能想出更多的解决方案，至少有三种不同的方法可以解决这个问题。 
// 你可以使用空间复杂度为 O(1) 的 原地 算法解决这个问题吗？ 
// 
//
// 
//
// 示例 1: 
//
// 
//输入: nums = [1,2,3,4,5,6,7], k = 3
//输出: [5,6,7,1,2,3,4]
//解释:
//向右旋转 1 步: [7,1,2,3,4,5,6]
//向右旋转 2 步: [6,7,1,2,3,4,5]
//向右旋转 3 步: [5,6,7,1,2,3,4]
// 
//
// 示例 2: 
//
// 
//输入：nums = [-1,-100,3,99], k = 2
//输出：[3,99,-1,-100]
//解释: 
//向右旋转 1 步: [99,-1,-100,3]
//向右旋转 2 步: [3,99,-1,-100] 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 2 * 104 
// -231 <= nums[i] <= 231 - 1 
// 0 <= k <= 105 
// 
//
// 
// 
// Related Topics 数组 
// 👍 986 👎 0

// 旋转数组

import java.util.Arrays;

public class T189_RotateArray{
    public static void main(String[] args) {
        Solution solution = new T189_RotateArray().new Solution();
         
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void rotate(int[] nums, int k) {
        // 方法一：使用同样大小数组，直接计算旋转后的位置进行放置
//        int length = nums.length;
//        //int[] source = (int[]) Arrays.copyOfRange(nums,0,length);
//        int[] source =(int[])nums.clone();
//        for(int i = 0; i < length; i++) {
//            int newIndex = (i + k) % length;
//            nums[newIndex] = source[i];
//        }
        // 方法二：双指针
        int length = nums.length;
        int[] source = (int[]) Arrays.copyOfRange(nums,0,length);
        int j = k;
        for (int i = 0; i < length; i++) {
            if (j < length) {
                nums[j] = source[i];
            } else {
                nums[j - length] = source[i];
            }
            j++;
        }
        // 方法二：利用子函数，每次移动一位，多次移动
        // 暴力解法-Time Limit Exceeded.
//        int length = nums.length;
//        for (int i = 0; i < k; i++) {
//            rotateOnepos(nums, length);
//        }
    }

//    public void rotateOnepos(int[] nums, int length) {
//        int tmp = nums[length - 1];
//        for (int i = length - 1; i > 0; i--) {
//            nums[i] = nums[i-1];
//        }
//        nums[0] = tmp;
//    }
}
//leetcode submit region end(Prohibit modification and deletion)

}