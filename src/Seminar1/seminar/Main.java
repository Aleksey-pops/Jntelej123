package Seminar1.seminar;

import java.time.LocalTime;
import java.util.Scanner;

/*
Задание No1+
📌 В консоли запросить имя пользователя. В зависимости от
текущего времени, вывести приветствие вида
📌 "Доброе утро, <Имя>!", если время от 05:00 до 11:59
📌 "Добрый день, <Имя>!", если время от 12:00 до 17:59;
📌 "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
📌 "Доброй ночи, <Имя>!", если время от 23:00 до 4:59
*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Представтесь пожалуйста");
        String name = scanner.nextLine();

        LocalTime time = LocalTime.now();
        System.out.println("Время " + time);
        int hour = time.getHour();
        if (hour >= 5 && hour < 12) {
            System.out.println("Доброе утро, " + name + "!");
            System.out.printf("Доброе утро, %s!", name);
        } else if (hour >= 12 && hour < 18) {
            System.out.println("Добрый день, " + name + "! Время = " + time);
        } else if (hour >= 18 && hour < 23) {
            System.out.println("Добрый вечер, " + name + "! Время = " + time);
        } else{
            System.out.println("Добрый ночи, " + name + "! Время = " + time);
        }
    }
}
