package guru.qa;

public class Main {
    public static void main(String[] args) {

        // символьный тип данных
        char aChar = 'A';

        // булевый тип данных
        boolean aBoolean = true;

        // числовые типы данных
        byte aByte = 123;
        short aShort = 1234;
        int anInt = 5453545;
        long aLong = 84545454L;

        // типы данных с плавающей запятой
        float aFloat = 5.34F;
        double aDouble = 8.423434;

        // Ссылочный тип данных
        String str = "строка";

        // Массив
        int arrayInt[][] = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Integer array [][][] = new Integer[3][2][1];

        // Вызов тестовых методов
        someTest(8, 3);
        anotherMethod("BoevoyBarsuk", "ZataivsheysyaDrakon");
        switchMethod("ZV");
        System.out.println(returnMethod(true));
        longIntMethod((int)aLong, aByte);

        // Примеры нисходящих преобразований типов данных и восходящих
        aShort = -(byte)33222;
        System.out.println("aShort = " + aShort + " после превышения допустимого значения, отсчет продолжается дальше");
        anInt = (short)-123;
        System.out.println("anInt = " + anInt + " для восходящего преобразования не нужно " +
                "явно указывать тип присваиваемого значения");
    }

    public static void someTest(int a, int b) {
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        System.out.println(a += 4);
        System.out.println(b *= 4);

        if (a > b) {
            System.out.println("a = " + a + " greater than " + b);
        } else if (a < b) {
            System.out.println("b = " + b + " greater than " + a);
        } else {
            System.out.printf("a = %d equlas b = %d%n", a, b);
            System.out.println(String.format("a = %d equlas b = %d", a, b));
        }
    }

    public static void anotherMethod(String user1, String user2) {
        if (user1.length() >= user2.length()) {
            System.out.println(user1 + " wins");
        } else if (!user2.startsWith("F") && user2.startsWith("Z")) {
            System.out.println("all right");
        } else if (user2.startsWith("F") || user2.startsWith("Z")) {
            System.out.println("someone wins");
        }
    }

    // один из примеров работы с разными типами данных
    public static void switchMethod(String element) {
        switch (element) {
            case "A":
                System.out.println(2 + element + " all the same string");
            case "B":
                System.out.println(6.320F + element + " all the same string");
            case "C":
                System.out.println(4.756765 + element + " all the same string");
            default:
                System.out.println(true + element + " all the same string");
        }
    }

    public static String returnMethod(boolean wayChoice) {
        return wayChoice
                ? "checkbox selected"
                : "checkbox must be selected";
    }

    // другой пример работы с разными типами данных
    public static void longIntMethod(int anInt1, int anInt2) {
        if (anInt1 > anInt2) {
            System.out.println("anInt1 = " + anInt1);
        }
    }
}
