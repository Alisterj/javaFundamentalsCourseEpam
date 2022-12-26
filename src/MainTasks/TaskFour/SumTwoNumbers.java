package MainTasks.TaskFour;

import java.util.Scanner;

public class SumTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean tryOn = true;
        System.out.println("Write two numbers:");
        Sum sum = new Sum(scanner.nextInt(), scanner.nextInt());
        System.out.println("Sum = " + sum.SumFunction());
    }
}
