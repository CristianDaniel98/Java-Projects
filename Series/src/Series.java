public class Series {

    public static int nSum(int numbers){
        int sum = 0;
        for(int i = 0; i < numbers; i++){
            sum += i;
        }
        return sum;
    }

    public static int factorial(int numbers){
        int factorial = 1;

        if(numbers == 0){return 0;}

        for(int i = 1; i <= numbers; i++){
            factorial *= i;
        }
        return factorial;
    }

    public static int fibonacci(int numbers){
        int fibonacci = 1;
        int tmp1 = 1;
        int tmp2 = 1;
        if(numbers == 0){return 0;}
        for(int i=2; i<numbers; i++){
            fibonacci = tmp1 + tmp2;
            tmp1 = tmp2;
            tmp2 = fibonacci;
        }

        return fibonacci;
    }
}
