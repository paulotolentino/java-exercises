import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int choice = -1;

        while (choice != 0) {
            Scanner sc = new Scanner(System.in);
            System.out.println("\n***** Java Exercises *****");
            System.out.println("1 - Factorial");
            System.out.println("2 - Fibonacci");
            System.out.println("3 - Multiplication Table");
            System.out.println("4 - Find Square Using Sum");
            System.out.println("5 - Power without Math.pow");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();

            switch (choice){
                case 1:
                    Factorial.main(new String[] {});
                    break;
                case 2:
                    Fibonacci.main(new String[] {});
                    break;
                case 3:
                    MultiplicationTable.main(new String[] {});
                    break;
                case 4:
                    FindSquareUsingSum.main(new String[] {});
                    break;
                case 5:
                    Power.main(new String[] {});
                    break;
                default:
                    System.out.println("Wrong option");
            }
            System.out.println("\n1 - Continue");
            System.out.println("\n0 - Finish");

            System.out.print("Choose an option: ");
            choice = sc.nextInt();

        }
        System.out.print("Finishing program...");
    }
}