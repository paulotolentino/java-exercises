import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int typedNumber = sc.nextInt();

        for (int i = 1; i < 11; i++) {
            int result = typedNumber * i;
            System.out.printf("%d * %d = %d\n", i, typedNumber, result);
        }
    }
}
