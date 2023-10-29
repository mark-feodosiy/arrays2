public class Main {
    public static void main(String[] args) {
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
            int i = 0;
            int summ = arr[i];
            for (; i <= arr.length; i++) {
                summ ++;
            }
            System.out.println(summ);
        }

}