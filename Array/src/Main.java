import java.util.Scanner;

public class Main {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int []arr = new int[5];
        arr[0] = 5;
        arr[1] = 26;
        arr[2] = 81;
        arr[3] = 84;
        arr[4] = 106;

        for(int i=0; i< arr.length;i++){
            System.out.println(arr[i]);
        }

        System.out.println("****************************");

        sortArr(arr);

        for(int i=0; i< arr.length;i++){
            System.out.println(arr[i]);
        }

    }

    public static int[] sortArr(int []arr) {
        int var;
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i - 1] < arr[i]) {
                    var = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = var;
                    flag = true;
                }
            }
        }
        return arr;
    }
}