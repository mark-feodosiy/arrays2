import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        System.out.println();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
            }
        return arr;
    }
        // Задача № 1
        public static void task1() {
            int[] arr = generateRandomArray();
            System.out.println(Arrays.toString(arr));
            int sum = 0;
            for (int element: arr) {
                sum += element;
            }
            System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        }
    // Задача № 2
    public static void task2() {
        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));
        int minWastes = 0;
        for (int element: arr) {
            if (element < element + 1) {
                minWastes = element;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minWastes + " рублей");
    }
}