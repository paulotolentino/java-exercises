import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int x = sc.nextInt();
        int initialA = 0;
        int initialB = 1;
        ArrayList<Integer> fibonacciList = new ArrayList<>();

        ArrayList<Integer> result = fibonacci(x, initialA, initialB, fibonacciList);
        System.out.printf("A sequencia de Fibonacci menor que o número %d é\n", x);
        result.forEach(System.out::println);
    }

    private static ArrayList<Integer> fibonacci(int x, int a, int b, ArrayList<Integer> fibonacciList){
        if (b >= x) {
            return fibonacciList;
        }

        if (a == 0) fibonacciList.add(a);

        fibonacciList.add(b);

        return fibonacci(x, b, a + b, fibonacciList);
    }
}
