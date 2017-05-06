package week2.codingbat;

import java.util.Scanner;

/**
 * Return the number of even ints in the given array. Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.

 countEvens([2, 1, 2, 3, 4]) → 3
 countEvens([2, 2, 0]) → 3
 countEvens([1, 3, 5]) → 0
 */
public class Event {
    public static void main(String[] args) {
        int[] number={1,3,5};
        System.out.println(countEvens(number));
    }

    private static int countEvens(int[] nums) {
    int counter=0;
        for (int i = 0; i <nums.length ; i++) {
            if ((nums[i]%2)==0){counter++;}
        }
        return counter;
    }
}
