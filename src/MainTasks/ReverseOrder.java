package MainTasks;

public class ReverseOrder {
    public static void main(String[] args) {
        //Отобразить в окне консоли аргументы командной строки в обратном порядке.
        reverseFunction("Alister","Ror", 24, "Jfggdsd");
    }
    public static void reverseFunction(String name, String soname, int age, String dopInfo) {
        System.out.println(dopInfo + ", " + age + ", " + soname + ", " + name);
    }
}
