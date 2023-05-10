import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Решение задачи №1");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int current : arr) {
            sum += current;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }

    public static void task2() {
        System.out.println("Решение задачи №2");
        int[] arr = generateRandomArray();
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Максимальная сумма трат за день " + max);
        int min = max;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min);
    }

    public static void task3() {
        System.out.println("Решение задачи №3");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int current : arr) {
            sum += current;
        }
        sum += sum * 100;
        double sr = (sum / 30) / 100;
        System.out.println("Средняя сумма трат за месяц составила " + sr);
    }
    public static void task4() {
        System.out.println("Решение задачи №4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char element;
        char index = 0;
        for (char i = 0; i < reverseFullName.length; i++) {
           element=reverseFullName[i];
           index=i;
            while (index > 0 && reverseFullName[index - 1] > element) {
reverseFullName[index]=reverseFullName[index-1];
index--;
reverseFullName[index]=element;
            }

        }
        System.out.println(Arrays.toString(new char[]{reverseFullName[index]}));
    }
}