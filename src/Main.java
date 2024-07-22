import java.time.LocalDate;

public class Main {

    public static void isLeap(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год — високосный год.");
        } else {
            System.out.println(year + " год — не високосный год.");

        }
    }

    public static void installSystem(int os, int yearProd) {
        if (yearProd <= 2015) {
            if (os == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else {
            if (os == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }

    public static String countDays(int deliveryDistance) {
        String day = "";
        if (deliveryDistance < 20) {
            day = "1";
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            day = "2";
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            day = "3";
        } else {
            day = "Свыше 100 км доставки нет ";
        }
        return day;
    }


    public static void main(String[] args) {
        System.out.println("Задание 1");
        int[] years = new int[125];
        for (int i = 0; i <= years.length - 1; i++) {
            years[i] = (i + 1900);

        }
        for (final int i : years) {
            isLeap(i);
        }

        System.out.println("Задание 2");
        installSystem(1, 2023);

        System.out.println("Задание 3");
        int deliveryDistance = 101;
        System.out.println("Потребуется дней: "+countDays(deliveryDistance));
    }
}