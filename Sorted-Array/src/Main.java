import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

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

    public static void printArray(int []array){
        for(int i=0; i<array.length; i++){
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array){
        boolean flag = true;
        int tmp;

        while(flag){
            flag = false;
            for(int i=0; i <array.length-1; i++)
                if(array[i] < array[i+1]){
                    tmp =array[i];
                    array[i] = array[i+1];
                    array[i+1] = tmp;
                    flag = true;
                }

        }

        return array;
    }


}