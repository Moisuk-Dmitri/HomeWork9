import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");

        int sum = 0;
        int[] expenses = {64500, 78000, 62000, 45100, 67000};

        for (int i = 0; i < expenses.length; i++) {
            sum += expenses[i];
        }

        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        System.out.println("Task 2");

        int minExpenses = expenses[0];
        int maxExpenses = expenses[0];

        for (int i = 1; i < expenses.length; i++) {
            if (minExpenses > expenses[i]) {
                minExpenses = expenses[i];
            }
            if (maxExpenses < expenses[i]) {
                maxExpenses = expenses[i];
            }
        }

        System.out.println("Минимальная сумма трат за неделю составила " + minExpenses + " рублей. Максимальная сумма трат за неделю составила " + maxExpenses + " рублей");

        System.out.println("Task 3");

        double averageExpenses = 0;

        for (int i = 0; i < expenses.length; i++) {
            averageExpenses += expenses[i];
        }
        averageExpenses /= expenses.length;

        System.out.println("Средняя сумма трат за месяц составила " + averageExpenses + " рублей");

        System.out.println("Task 4");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}
