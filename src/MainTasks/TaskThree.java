package MainTasks;

public class TaskThree {
    public static void main(String[] args) {
        //Вывести заданное количество случайных чисел с переходом и без перехода на новую строку
        show();
    }
    public static void show() {
        int[] randNumbers = new int[1 + (int) (Math.random() * 101)];
        for(int elInd = 0; elInd < randNumbers.length; elInd++) {
            randNumbers[elInd] = (int) (Math.random() * 50) + 1;
            System.out.print(elInd != 0 ? " " + randNumbers[elInd] : randNumbers[elInd]);
        }
    }
}
