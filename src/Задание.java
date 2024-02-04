import java.util.Random;
import java.util.Scanner;

public class Задание {
    public static void main(String[] args) {
        System.out.println("Компьютер загадывает число от 1 до 100...");
        Random rand = new Random();
        int n = rand.nextInt(100) + 1;
        int k = 0;
        for (int i = 0; i != n; k++) {
            System.out.print("Угадайте число: ");
            Scanner scan = new Scanner(System.in);
            i = scan.nextInt();
            if (i < n) {
                System.out.println("Я сам в шоке, но загаданное число больше, брат");
            }
            if (i > n) {
                System.out.println("Не ожидал от тебя такого. Загаданное число меньше, брат");
            }
        }
        System.out.print("Молодец, ты угадал число!\n" + "Загаданное число: " + n + "\nКоличество попыток: " + k);
    }
}