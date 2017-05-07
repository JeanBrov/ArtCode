package week2.codingbat_array2;

/**
 * Return the sum of the numbers in the array, except ignore sections of numbers starting with a 6 and
 * extending to the next 7 (every 6 will be followed by at least one 7). Return 0 for no numbers.

 sum67([1, 2, 2]) → 5
 sum67([1, 2, 2, 6, 99, 99, 7]) → 5
 sum67([1, 1, 6, 7, 2]) → 4

 sum67([2, 7, 6, 2, 6, 7, 2, 7]) → 18
 */
public class Sum67 {
    public static void main(String[] args) {
        int[] arr1={1, 2, 2};
        int[] arr2={1, 2, 2, 6, 99, 99, 7};
        int[] arr3={1, 1, 6, 7, 2};
        int[] arr4={2, 7, 6, 2, 6, 7, 2, 7};

        System.out.println(sum67(arr1));
        System.out.println(sum67(arr2));
        System.out.println(sum67(arr3));
        System.out.println(sum67(arr4));

    }

    private static int sum67(int[] nums) {
        boolean tagFindSix=false;
        int sum=0;
        for (int i = 0; i <nums.length ; i++) {
            if (nums[i]==6){tagFindSix=true;}
            else {
                if(tagFindSix){
                    if (nums[i]==7){tagFindSix=false;}
                }
                else {
                    sum=sum+nums[i];
                }

                }
            }
        return sum;
    }
}

