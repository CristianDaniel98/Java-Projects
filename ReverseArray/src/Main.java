import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] array = initArray(5);
        System.out.println("**********************");
        printArray(array);
        array =reverseArray(array);
        System.out.println("***********************");
        printArray(array);


    }

    private static int[] initArray(int count){

        int[] array = new int[count];

        for(int i=0; i<array.length; i++){
            System.out.println("Enter a number: ");
            int var = scanner.nextInt();
            scanner.nextLine();
            array[i] = var;
        }

        return array;
    }

    private static int[] reverseArray(int[] array){
        int[] reverseArray = array;
        int tmp;
        int length = (reverseArray.length)/2;
        for(int i=0; i<length; i++){
            tmp = reverseArray[i];
            reverseArray[i] = reverseArray[(reverseArray.length-1)-i];
            reverseArray[(reverseArray.length-1)-i] = tmp;
        }

        return reverseArray;



    }
    private static void printArray(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}