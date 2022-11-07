import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int size = readIntegers();
        int []array = readElements(size);
        System.out.println("Min elements in array is: " + findMin(array));
    }

    private static int readIntegers(){
        System.out.println("Enter the size of array:");
        return scanner.nextInt();
    }

    private static int[] readElements(int size){
        int []ret_array = new int[size];
        int var;

        for(int i=0; i< ret_array.length; i++){
            System.out.println("Enter a number: ");
            var = scanner.nextInt();
            ret_array[i] = var;
        }

        return ret_array;
    }

    private static int findMin(int[] array){
        int min = Integer.MAX_VALUE;
        for (int j : array) {
            if (min > j) {
                min = j;
            }
        }
        return min;
    }
}