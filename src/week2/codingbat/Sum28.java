package week2.codingbat;

/**
 * Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.

 sum28([2, 3, 2, 2, 4, 2]) → true
 sum28([2, 3, 2, 2, 4, 2, 2]) → false
 sum28([1, 2, 3, 4]) → false
 */
public class Sum28 {
    public static void main(String[] args) {
        int[] arr1={2, 3, 2, 2, 4, 2};
        int[] arr2={2, 3, 2, 2, 4, 2, 2};
        int[] arr3={2, 3, 2, 2, 4, 2, 2};

        System.out.println(sum28(arr1));
        System.out.println(sum28(arr2));
        System.out.println(sum28(arr3));

    }

    public static boolean sum28(int[] nums) {
        int tag8=4;
        int count=0;
        boolean result=false;
        for (int i = 0; i <nums.length ; i++) {
            if (nums[i]==2){
                count++;
                if (count>tag8){return false;}
            }
        }
        if (count==tag8) result=true;
        return result;
    }

}
