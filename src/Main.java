import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Задача 1
        System.out.println("Задача 1");
        int month[] = {32000, 17000, 7000, 26000, 50000};
        int sum = 0;
        for (int i: month) {
            sum += i;
        }
        System.out.println("Сумма трат за месяц составила "+ sum +" рублей");
        System.out.println();

        // Задача 2
        System.out.println("Задача 2");
        int week[] = {7000, 1000, 4000, 5000, 8000};
        int min = week[0];
        int max = week[0];
        for (int i: week) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила "+ min +" рублей");
        System.out.println("Максимальная сумма трат за неделю составила "+ max +" рублей");
        System.out.println();

        // Задача 3
        System.out.println("Задача 3");
        int month1 [] = {2000, 10000, 3000, 9000, 1000};
        double average = 0;
        for (int i: month1) {
            average += i;
        }
        average = average / month1.length;
        System.out.println("Средняя сумма трат за месяц составила "+ average +" рублей");
        System.out.println();

        // Задача 4
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = 0; i < (reverseFullName.length -1) /2; i++) {
            char temp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length -1 -i];
            reverseFullName[reverseFullName.length -1 -i] = temp;
        }
        for (int i = 0; i < reverseFullName.length; i++) {
            System.out.print(reverseFullName[i]);
        }
    }
}