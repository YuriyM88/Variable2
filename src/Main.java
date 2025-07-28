public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1 ");
        byte a = 100;
        System.out.println(a);
        short b = 200;
        System.out.println(b);
        int c = 400;
        System.out.println(c);
        long d = 800;
        System.out.println(d);
        float e = 1600.4564F;
        System.out.println(e);
        double f = 2400.84561687d;
        System.out.println(f);

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

    }
}