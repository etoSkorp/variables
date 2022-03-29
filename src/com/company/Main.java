package com.company;

public class Main {

    public static void main(String[] args) {
        String str = "aabccddefgghiijjkk";
        byte byteNum = 5;
        short shortNum = 32000;
        int intNum = 1_000_000;
        long longNum = 1000000001L;
        float floatNum = 3.14f;
        double doubleNum = 9.8;
        char symbol = 'A';
        boolean pravda = false;


        float fighterOne = 78.2f, fighterTwo = 82.7f;
        System.out.println(fighterOne + fighterTwo + "кг");
        System.out.println(fighterTwo - fighterOne + "кг");


        int banana = 80, milk = 105, iceCream = 100, eggs = 70;
        System.out.println((banana * 5 + milk * 2 + iceCream * 2 + eggs * 4) / 1000f + "кг");


        int diet1 = 7000 / 250, diet2 = 7000 / 500;
        System.out.println(diet1 + " дней");
        System.out.println(diet2 + " дней");
        System.out.println((diet1 + diet2) / 2 + " день");


        int mashka = 67760, denchik = 83690, kris = 76230, beforeRaise, afterRaise;
        beforeRaise = mashka + denchik + kris;
        mashka += mashka * 0.1;
        denchik += denchik * 0.1;
        kris += kris * 0.1;
        afterRaise = mashka + denchik + kris;
        System.out.println("Маша теперь получает " + mashka + " рублей");
        System.out.println("Денис теперь получает " + denchik + " рублей");
        System.out.println("Кристина теперь получает " + kris + " рублей");
        System.out.println("Годовой доход вырос на " + (afterRaise - beforeRaise) * 12 + " рублей");
    }
}
