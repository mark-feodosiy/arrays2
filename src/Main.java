import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        System.out.println();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    // Задача № 1
    public static void task1() {
        int[] arr = generateRandomArray();
        //System.out.println(Arrays.toString(arr));
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        System.out.println();
    }

    // Задача № 2
    public static void task2() {
        int[] arr = generateRandomArray();
        //System.out.println(Arrays.toString(arr));
        int minWastes = arr[0];
        int maxWastes = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minWastes) {
                minWastes = arr[i];
            }
            if (arr[i] > maxWastes) {
                maxWastes = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minWastes + " рублей. Максимальная сумма трат за день составила " + maxWastes + " рублей");
        System.out.println();
    }

    // Задача № 3
    public static void task3() {
        int[] arr = generateRandomArray();
        //System.out.println(Arrays.toString(arr));
        double sum = 0;
        for (int element : arr) {
            sum += element;
        }
        double average = sum / 30;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");
        System.out.println();
    }
    // Задача № 4
    public static void task4() {
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
            }
    }
}
