package week2;

/**
 * Special massive .
 */
public class ArrayUtils {

    public static int genRandomNum(int range){
        return (int)(Math.random()*range);
    }

    public static int[] generateMas(int size, int range){
        int[] mas = new int[size];
        for (int i=0; i<mas.length;i++){
            mas[i]=genRandomNum(range);
        }
        return mas;
    }
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
}
