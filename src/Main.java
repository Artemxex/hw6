import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {

        //Задача 1

        int[] money = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < money.length; i++) {
            sum = sum + money[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        //Задача 2

        int max = 0;
        int min = 200001;
        for (int i = 0; i < money.length; i++) {
            if (money[i] > max) {
                max = money[i];
            }
            if (money[i] < min) {
                min = money[i];
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей");
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей");

        //Задача 3

        double sred = sum;
        double sredFin = sred / 30;
        System.out.println("Средняя сумма трат за месяц составила " + sredFin + " рублей");

        //Задача 4

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i < reverseFullName.length && i > -1; i = i - 1) {
            System.out.print(reverseFullName[i]);

        }
    }

    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;

        }

        return arr;
    }
}