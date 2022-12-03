import java.text.MessageFormat;

public class Fibonacci {

    //fibonacci sequence taking an integer as argument
    //take input as 20
    //enter user input into recursion fibonacci sequence
    //save number of times each value has calculated
    //print count of number of times each value has been calculated

    public static int[] fibonacciCount = new int[21];

    //Delete later
    public static void main(String[] args){
        int fibonacci = RecursionFibonacci(20);
        System.out.println("fibonacci(20) = " + fibonacci);
        for(int i = 1; i <= 20; i++){
            System.out.println(MessageFormat.format("{0} calls to fibonacci {1}",fibonacciCount[i], i));
        }

    }

    public static int RecursionFibonacci(int n){
        if(n == 0){
            fibonacciCount[n] = fibonacciCount[n] + 1;
            return 0;
        }
        if(n == 1){
            fibonacciCount[n] = fibonacciCount[n] + 1;
            return 1;
        }
        fibonacciCount[n] = fibonacciCount[n] + 1;
        return RecursionFibonacci(n -1 ) + RecursionFibonacci(n - 2);
    }
}
