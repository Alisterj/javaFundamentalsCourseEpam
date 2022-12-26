package MainTasks;

import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        //Приветствовать любого пользователя при вводе его имени через командную строку.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write your name: ");
        sayHello(scanner.nextLine());
    }
    public static void sayHello(String name) {
        System.out.println("Hello " + name);
    }
}
