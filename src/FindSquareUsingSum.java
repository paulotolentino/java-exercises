import java.util.Scanner;

public class FindSquareUsingSum {
    public static void main(String[] args) {
        System.out.print("Digite um número inteiro positivo: ");
        Scanner scanner = new Scanner(System.in);

        int typedNumber = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= typedNumber; i++) {
            sum += (i*2)-1;
        }

        System.out.printf("O quadrado de %d é %d", typedNumber, sum);
    }
}
