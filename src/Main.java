//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //        Task № 1
        System.out.println();
        System.out.println("          Задача №1");
        byte clientOS = 0;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        //        Task № 2
        System.out.println();
        System.out.println("          Задача №2");
        int clientDeviceYear = 2015;
        if (clientOS == 1) {
            if (clientDeviceYear > 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else if (clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }

        //        Task № 3
        System.out.println();
        System.out.println("          Задача №3");
        int year = 2021;
        boolean leapYear;
        if ((year % 4) == 0) {
            if ((year % 100) == 0 && (year % 400) == 0) {
                leapYear = true;
            } else if ((year % 100) != 0) {
                leapYear = true;
            } else {
                leapYear = false;
            }
        } else {
            leapYear = false;
        }
        if (year < 1584) {
            System.out.println("Введите более поздний год, чем 1584 год");
        } else if (leapYear) {
            System.out.println("Год " + year + " високосный");
        } else {
            System.out.println("Год " + year + " не високосный");
        }

        //        Task № 4
        System.out.println();
        System.out.println("          Задача №4");
        byte deliveryDistance = 95;
        if (deliveryDistance > 100) {
            System.out.println("Свыше 100км доставка не осуществляется.");
        } else if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + 1);
        } else if (deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + 2);
        } else {
            System.out.println("Потребуется дней: " + 3);
        }

        //        Task № 5
        System.out.println();
        System.out.println("          Задача №5");
        byte monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }

    }
}