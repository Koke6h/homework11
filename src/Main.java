import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        checkYearLeap(20234);
        System.out.println("Task 2");
        recommendVer(1, 2024);
        System.out.println("Task3");
        int deliveryDays = deliveryDistance(95);
        if (deliveryDays > 0) {
            System.out.println("Потребуется дней для доставки: " + deliveryDays);
        } else {
            System.out.println("Доставки нет");
        }
    }
    public static void checkYearLeap(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + "год является вискокосным");
        } else {
            System.out.println(year + "гоl не является високосным");
        }
    }

    public static void recommendVer(int clientOs, int clientYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOs == 0 && clientYear == currentYear) {
            System.out.println("Установите обычную версию приложения для iOS по ссылке");
        } else if (clientOs == 0 && clientYear<currentYear){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }else if (clientOs == 1 && clientYear==currentYear) {
            System.out.println("Установите обычную версию приложения для android по ссылке");
        } else if (clientOs == 1 && clientYear<currentYear){
            System.out.println("Установите облегченную версию приложения для android по ссылке");
        }else {
            System.out.println("OS не поддерживатеся");
        }
    }
    public static int deliveryDistance(int distance){
        int deliveryDays=0;
        if (distance<=20){
            deliveryDays += 1;
        } else if (distance<=60) {
            deliveryDays += 2;
        } else if (distance<=100) {
            deliveryDays += 3;
        }
        else {
            System.out.println("Доставки нет");
        }
        return deliveryDays;
    }
}