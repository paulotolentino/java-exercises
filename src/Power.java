import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor X: ");
        int x = sc.nextInt();

        System.out.print("Digite o valor de Y: ");
        int y = sc.nextInt();

        int result = Power.expo(x, y);

        System.out.printf("A potencia de %d elevado a %d é %d", x, y, result);

    }

    private static int expo(int x, int y) {
        int total = 1;
        for (int i = 1; i <= y; i++) {
            total *= x;
        }
        return total;
    }
}
