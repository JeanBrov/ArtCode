package week2.codingbat;

/**
 * Return the "centered" average of an array of ints, which we'll say is the mean average of the values, except ignoring the largest and smallest values
 * in the array. If there are multiple copies of the smallest value, ignore just one copy, and likewise for the largest value.
 * Use int division to produce the final average. You may assume that the array is length 3 or more.

 centeredAverage([1, 2, 3, 4, 100]) → 3
 centeredAverage([1, 1, 5, 5, 10, 8, 7]) → 5
 centeredAverage([-10, -4, -2, -4, -2, 0]) → -3
 */
public class Average {
    public static void main(String[] args) {
        int[]arr1={1, 2, 3, 4, 100};
        int[]arr2={1, 1, 5, 5, 10, 8, 7};
        int[]arr3={-10, -4, -2, -4, -2, 0};
        System.out.println(centeredAverage(arr1));
        System.out.println(centeredAverage(arr2));
        System.out.println(centeredAverage(arr3));
    }
    public static int centeredAverage(int[] nums) {
        int largest=nums[0];
        int smallest=nums[0];
        int indexMax=0;
        int indexMin=0;

        for (int i = 0; i <nums.length ; i++) {
                if (nums[i]>largest){largest=nums[i]; indexMax=i;}
                if (nums[i]<smallest){smallest=nums[i];indexMin=i;}
            }

        int totalSum=0;
        int average=0;
        if(smallest==largest) {
            for (int i = 0; i <nums.length ; i++) {
                totalSum=totalSum+nums[i];
            }
            average=totalSum/nums.length;
        }
        else {
            for (int i = 0; i <nums.length ; i++) {
                if ((i==indexMax)||(i==indexMin)){}
                else {totalSum=nums[i]+totalSum; }

        }
        average=totalSum/(nums.length-2);
        }
        return average;
        }

        }



