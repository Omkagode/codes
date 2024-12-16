
//Brute force Apporach :---
//Time Complexity :- O(n^2)
//Space Complexity :- O(1)

// public class TwoSum {

//     public static int[] Sum(int[] nums, int target) {
//         for (int i = 0; i < nums.length; i++) {
//             for (int j = i + 1; i < nums.length; j++) {
//                 if (nums[i] + nums[j] == target) {
//                     return new int[] { nums[i], nums[j] };
//                 }

//             }
//         }
//         return new int[]{};
//     }

//     public static void main(String[] args) {
//         int[] nums = { 2, 7, 11, 15 };
//         int target = 9;
//         int[] result = Sum(nums, target);
//         for(int i=0;i<result.length;i++){
//             System.out.print(result[i]+"");
//         }
//     }

// }

import java.util.HashMap;
import java.util.Map;

/**************************
 * ---- Optimal Apporach ----
 *****************************/
// Optimal Apporach :---
// Time Complexity :- O(n)
// Space Complexity :- O(n)

public class TwoSum {

    public static int[] Sum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();// Create a HashMap to store the elements we have seen so far and
                                                    // their indices
        for (int i = 0; i < nums.length; i++) {
            int num1 = target - nums[i];// Find the complement of the current element with respect to the
            // target sum
            if (map.containsKey(num1)) {
                // return new int[] { num1, nums[i] };  // return values of targrt sum
                return new int[] { map.get(num1), i };  //return idx of target sum
            }
            map.put(nums[i], i);
        }

        return new int[] {};
    }

    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] result = Sum(nums, target);
       System.out.println("First No  : "+ result[0]);
       System.out.println("Second No : "+ result[1]);
    }

}