public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }

    public static void task1() {
        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        for (int i = 0; i <= 17; i += 2) {
            System.out.println(i);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        for (int i = 10; i >= -10; i -= 1) {
            System.out.println(i);
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        for (int i = 1904; i <= 2096; i += 4) {
            System.out.println(i + " год является високосным");
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        for (int i = 7; i <= 98; i += 7) {
            System.out.println(i);
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.println(i);
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int salary = 29000;
        int savings = 0;
        for (int i = 1; i <= 12; i++) {
            savings = savings + salary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + savings + " рублей");
        }
    }

    public static void task9() {
        System.out.println("Задача 9");
        float salary = 29000f;
        float savings = 0f;
        int yearPercent = 12;
        int monthPercent = yearPercent / 12;
        float percentages = 0f;
        for (int i = 1; i <= 12; i++) {
            percentages = savings * monthPercent / 100;
            savings = savings + salary + percentages;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + savings + " рублей");
        }
    }

    public static void task10() {
        //int a =
        System.out.println("Задача 10");
        for (int i = 1; i <= 10; i++) {
            int a = i * 2;
            System.out.println("2*" + i + "=" + a);
        }
    }
}

