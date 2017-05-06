package week2.codingbat;

/**
 * Given an array of ints, return true if the array contains a 2 next to a 2 somewhere.

 has22([1, 2, 2]) → true
 has22([1, 2, 1, 2]) → false
 has22([2, 1, 2]) → false
 */
public class Has22 {
    public static void main(String[] args) {
        int[] arr1={1, 2, 2};
        int[] arr2={1, 2, 1, 2};
        int[] arr3={2, 1, 2};
        System.out.println(has22(arr1));
        System.out.println(has22(arr2));
        System.out.println(has22(arr3));

    }

    private static boolean has22(int[] nums) {
        boolean find22=false;
        boolean find2=false;
        for (int i = 0; i <nums.length ; i++) {
            if ((nums[i]==2)&&find2){find22=true; break;}
            else {
                if(nums[i]==2){
                    find2=true;
                }
                else find2=false;

            }
        }
    return find22;
    }

}
