public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1 ");
        byte a = 100;
        System.out.println("Значение переменной 'а' c типом 'byte' равно " + a );
        short b = 200;
        System.out.println("Значение переменной 'b' c типом 'short' равно " + b );
        int c = 400;
        System.out.println("Значение переменной 'c' c типом 'int' равно " + c );
        long d = 800;
        System.out.println("Значение переменной 'b' c типом 'long' равно " + d );
        float e = 1600.4564F;
        System.out.println("Значение переменной 'e' c типом 'float' равно " + e );
        double f = 2400.84561687d;
        System.out.println("Значение переменной 'f' c типом 'double' равно " + f );

        System.out.println("Задание 2 ");
        float test1 = 27.12F;
        System.out.println(test1);
        long test2 = 987_678_965_549L;
        System.out.println(test2);
        float test3 = 2.786F;
        System.out.println(test3);
        short test4 = 569;
        System.out.println(test4);
        short test5 = -159;
        System.out.println(test5);
        short test6 = 27897;
        System.out.println(test6);
        byte test7 = 67;
        System.out.println(test7);

        System.out.println("Задание 3 ");
        byte teacher1 = 23;
        byte teacher2 = 27;
        byte teacher3 = 30;
        int teacherAddition = teacher1 + teacher2 +teacher3;
        short paper = 480;
        int paperStudent = paper / teacherAddition;
        System.out.println("На каждого ученика рассчитано " + paperStudent + " листов бумаги");

        System.out.println("Задание 4");
        byte bottles = 16;
        byte time = 2;
        int oneMinute = bottles / time;
        byte minute2 = 20;
        int minutePerTwenty = minute2 * oneMinute;
        System.out.println("За " + minute2 + " минут машина произвела " + minutePerTwenty + " штук бутылок");
        byte day = 24;
        byte hour = 60;
        int dayHour = oneMinute * hour * day;
        System.out.println("За " + day + " часа машина произвела " + dayHour + " штук бутылок");
        byte days3 = 3;
        int threeDays = days3 * dayHour;
        System.out.println("За " + days3 + " дня машина произвела " + threeDays + " штук бутылок");
        byte month1 = 30;
        int monthOne = month1 * dayHour;
        System.out.println("За " + month1 + " дней машина произвела " + monthOne + " штук бутылок");

        System.out.println("Задание 5");
        byte totalCans = 120;
        byte whitePerClass = 2;
        byte brownPerClass = 4;
        int cansPerClass = whitePerClass + brownPerClass;
        int totalClasses = totalCans / cansPerClass;
        int whiteCans = totalClasses * whitePerClass;
        int brownCans = totalClasses * brownPerClass;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + whiteCans + " банок белой краски и " + brownCans + " банок коричневой краски");

        System.out.println("Задание 6");
        byte banana = 5;
        byte oneBananaGr = 80;
        int totalBananaGr = banana * oneBananaGr;
        byte milk = 2;
        byte oneMilkGr = 105;
        int totalMilkGr = milk * oneMilkGr;
        byte ice = 2;
        byte oneIceGr = 100;
        int totalIceGr = ice * oneIceGr;
        byte eggs = 4;
        byte oneEggsGr = 70;
        int totalEggsGr = eggs * oneEggsGr;
        int breakfastGr = totalBananaGr + totalMilkGr + totalIceGr + totalEggsGr;
        System.out.println (breakfastGr + " грамм");
        int GrPerKg = 1000;
        float weightKg = breakfastGr / (float) GrPerKg;
        System.out.println (weightKg + " килограмм");

        System.out.println("Задание 7");
        byte kg = 7;
        short weightLossGr = 250;
        short weightLossGr2 = 500;
        int grPerKg = 1000;
        int weightFinishGr = kg * grPerKg;
        int finishGr1 = weightFinishGr / weightLossGr;
        System.out.println(finishGr1 + " дней при похудении на 250 грамм");
        int finishGr2 = weightFinishGr / weightLossGr2;
        System.out.println(finishGr2 + " дней при похудении на 500 грамм");
        int averageDaySum = (weightLossGr2 + weightLossGr) / 2;
        float totalAverageDay = weightFinishGr / (float) averageDaySum;
        System.out.printf("Дней в среднем %.1f", totalAverageDay); // попытка сокращения колличества цифр после точки, правда не понял как после вывода результата написать текст.

        System.out.println();
        System.out.println("Задание 8");
        int masha = 67760;
        int denis = 83690;
        int christina = 76230;
        float increase = 1.1F;
        int months = 12;
        float increaseMasha = masha * increase;
        float increaseDenis = denis * increase;
        float increaseChristina = christina * increase;
        float yearDifferenceMasha = (increaseMasha * months) - (masha * months);
        float yearDifferenceDenis = (increaseDenis * months) - (denis * months);
        float yearDifferenceChristina = (increaseChristina * months) - (christina * months);
        System.out.println("Маша теперь получает " + increaseMasha + " рублей. Годовой доход вырос на " + yearDifferenceMasha + " рублей" );
        System.out.println("Денис теперь получает " + increaseDenis + " рублей. Годовой доход вырос на " + yearDifferenceDenis + " рублей" );
        System.out.println("Маша теперь получает " + increaseChristina + " рублей. Годовой доход вырос на " + yearDifferenceChristina + " рублей" );


    }
}