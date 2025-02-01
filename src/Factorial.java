import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.print("Digite um número inteiro positivo: ");
        Scanner sc = new Scanner(System.in);

        int typedNumber = sc.nextInt();

        int result = factorial(typedNumber);
        System.out.printf("O fatorial de %d é %d", typedNumber, result);
    }

    private static int factorial(int num) {
        if (num == 1) return 1;

        return num * factorial(num -1);
    }
}
