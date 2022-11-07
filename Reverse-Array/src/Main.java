import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array ={1, 2, 3, 4, 5};
        reverse(array);
    }

    private static void reverse(int []array){
        System.out.println("Array = " + Arrays.toString(array));
        int tmp;
        int size = (array.length)/2;
        for(int i=0; i<size; i++){
            tmp = array[i];
            array[i] = array[array.length-i-1];
            array[array.length-i-1] = tmp;
        }

        System.out.println("Reversed array = " + Arrays.toString(array));
    }
}