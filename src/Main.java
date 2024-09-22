public class Main {
    public static void main(String[] args) {
        ///////////Задача 1
        byte a = 25;
        short b = 4000;
        int c = 500000;
        long d = 12345678901L;
        float e = 5.68f;
        double  f = 0.7777777777;
        System.out.println("Значение переменной a с типом byte равно " + a);
        System.out.println("Значение переменной b с типом short равно " + b);
        System.out.println("Значение переменной c с типом int равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной e с типом float равно " + e);
        System.out.println("Значение переменной f с типом double равно " + f);
        //////////Задача 2
        float aA = 27.12f;
        long bB = 987678965549L;
        float cC = 2.786f;
        short dD = 569;
        short eE = -159;
        short fF = 27897;
        byte gG = 67;
        System.out.println(aA);
        System.out.println(bB);
        System.out.println(cC);
        System.out.println(dD);
        System.out.println(eE);
        System.out.println(fF);
        System.out.println(gG);
        /////////Задача 3
        byte classOne = 23;
        byte classTwo = 27;
        byte classThree = 30;
        short paper = 480;
        int result = paper / (classOne + classTwo + classThree);
        System.out.println("На каждого ученика рассчитано " + result + " листов бумаги");
        /////////Задача 4
        byte bottle = 16;
        byte time = 2;
        int oneBottle = bottle / time;
        int timeTwo = oneBottle * 20;
        System.out.println("За 20 минут машина произвела " + timeTwo + " штук бутылок");
        int timeDay = (oneBottle * 60) * 24;
        System.out.println("За 1 день машина произвела " + timeDay + " штук бутылок");
        int timeThreeDays = timeDay * 3;
        System.out.println("За 3 дня машина произвела " + timeThreeDays + " штук бутылок");
        int timeMonth = timeDay * 30;
        System.out.println("За 1 месяц машина произвела " + timeMonth + " штук бутылок");
        ///////Задача 5
        byte box = 120;
        int clasS = box / (4+2);
        int boxWhite = clasS * 2;
        int boxBrown = clasS * 4;
        System.out.println("В школе, где " + clasS + " классов, нужно " + boxWhite + " банок белой краски и " + boxBrown + " банок коричневой краски");
        ///////Задача 6
        int bananas = 5 * 80;
        int milk = 105 * 2;
        int iceCream = 2 * 100;
        int egg = 4 * 70;
        int weightGr = bananas + milk + iceCream + egg;
        System.out.println("Вес спортзавтрака равен " + weightGr + " грамм");
        int grPerKg = 1000;
        float weightKg = weightGr/(float)grPerKg;
        System.out.println("Вес спортзавтрака равен " + weightKg + " кг");
        ////////Задача 7
        byte weightOne = 7;
        int grPereKg = 1000;
        int weightTwo = weightOne * grPereKg;
        int resOne =  weightTwo / 250;
        System.out.println("Если спортсмен будет терять каждый день по 250 грамм - то на это уйдет " + resOne + " дней");
        int resTwo = weightTwo / 500;
        System.out.println("Если спортсмен будет терять каждый день по 500 грамм - то на это уйдет " + resTwo + " дней");
        int resThree = (resOne + resTwo) / 2;
        System.out.println("В среднем , чтобы добиться результата похудения потребуется " + resThree + " день");
        ////////Задача 8
        int masha = 67760;
        int den = 83690;
        int kris = 76230;
        int mashaProc = (67760 * 10) / 100;
        int mashaZp = masha + mashaProc;
        int mashaOne = masha * 12;
        int mashaTwo = (mashaZp * 12) - mashaOne;
        System.out.println("Маша теперь получает " + mashaZp + " рублей. Годовой доход вырос на " + mashaTwo + " рублей");
        int denProc = (83690 * 10) / 100;
        int denZp = den + denProc;
        int denOne = den * 12;
        int denTwo = (denZp * 12) - denOne;
        System.out.println("Денис теперь получает " + denZp + " рублей. Годовой доход вырос на " + denTwo + " рублей");
        int krisProc = (76230 * 10) / 100;
        int krisZp =  kris + krisProc;
        int krisOne = kris * 12;
        int krisTwo = (krisZp * 12) - krisOne;
        System.out.println("Кристина теперь получает " + krisZp + " рублей. Годовой доход вырос на " + krisTwo + " рублей");



    }
}