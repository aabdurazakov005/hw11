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
        int currentYear = LocalDate.now().getYear();
        if (os == 0 && yearProd == currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (os == 0 && yearProd < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (os == 1 && yearProd == currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (os == 1 && yearProd < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

    }

    public static void countDays(int deliveryDistance) {
        if (deliveryDistance <= 100) {
            if (deliveryDistance < 20) {
                System.out.println("Доставка в пределах " + deliveryDistance + " км " + "занимает сутки.");
            } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
                System.out.println("Доставка в пределах " + deliveryDistance + " км " + "занимает двое суток.");
            } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
                System.out.println("Доставка в пределах " + deliveryDistance + " км " + "занимает трое суток.");
            }
        } else if (deliveryDistance > 100) {
            System.out.println("На такие расстояния доставка не ведется!");
        }
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
        countDays(101);
    }
}