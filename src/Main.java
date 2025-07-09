import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    //Задание 1
    public static void checkYear(int year) {
        if (year >= 1584 && year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    //Задание 2
    public static void deviceYear(int clientOS, int clientDeviceYear) {

        int currentYear = LocalDate.now().getYear();

        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear <= currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear <= currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    //Задание 3
    public static String calculatorDeliveryDays(int deliveryDistance) {
        int deliveryDay = 1;

        if (deliveryDistance <= 20) {
            deliveryDay = 1;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryDay++;
//            System.out.println("Потребуется дней: " + deliveryDay);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryDay += 2;
//            System.out.println("Потребуется дней: " + deliveryDay);
        } else {
            return "Доставки нет";
        }
        return "Потребуется дней: " + deliveryDay;
    }

    //Вывод значений
    public static void main(String[] args) {

        checkYear(2020);
        checkYear(2013);
        checkYear(1992);

        System.out.println(" ");

        deviceYear(0, 2014);
        deviceYear(0, 2018);
        deviceYear(1, 2014);
        deviceYear(0, 2024);

        System.out.println(" ");

       String result = calculatorDeliveryDays(5);
        String result1 = calculatorDeliveryDays(55);
        String result2 = calculatorDeliveryDays(78);
        String result3 = calculatorDeliveryDays(101);
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

    }
}