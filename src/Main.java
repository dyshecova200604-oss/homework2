//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        System.out.printf("Hello and welcome!");
        System.out.println("Домашняя работа2");
        System.out.println("Задача8");
        int monthSalaryM = 67760;
        int monthSalaryD = 83690;
        int monthSalaryK = 76230;
        byte monthes = (byte) 12;
        double salaryIncreasePercentage = 1.1;
        int salaryOfYearM = monthSalaryM * monthes;
        double salaryOfYearD = monthSalaryD * monthes;
        int salaryOfYearK = monthSalaryK * monthes;
        System.out.println("Годовая зарплата сотрудников:Маши,Дениса,Кристины");
        System.out.println(salaryOfYearM);
        System.out.println(salaryOfYearD);
        System.out.println(salaryOfYearK);
        double amountOf10PercentOfMonthSalaryM = monthSalaryM * salaryIncreasePercentage;
        double amountOf10PercentOfMonthSalaryD = monthSalaryD * salaryIncreasePercentage;
        double amountOf10PercentOfMonthSalaryK = monthSalaryK * salaryIncreasePercentage;
        System.out.println("Месячная зарплата сотрудников после повышения:Маши,Дениса,Кристины.");
        System.out.println(amountOf10PercentOfMonthSalaryM);
        System.out.println(amountOf10PercentOfMonthSalaryD);
        System.out.println(amountOf10PercentOfMonthSalaryK);
        System.out.println("Годовая зарплата сотрудников после повышения:Маши,Дениса,Кристины.");
        double salaryOfYearWith10PercentM = amountOf10PercentOfMonthSalaryM * monthes;
        double salaryOfYearWith10PercentD = amountOf10PercentOfMonthSalaryD * monthes;
        double salaryOfYearWith10PercentK = amountOf10PercentOfMonthSalaryK * monthes;
        System.out.println(salaryOfYearWith10PercentM);
        System.out.println(salaryOfYearWith10PercentD);
        System.out.println(salaryOfYearWith10PercentK);
        double differenceSalaryM = salaryOfYearWith10PercentM - salaryOfYearM;
        double differenceSalaryD = salaryOfYearWith10PercentD - salaryOfYearD;
        double differenceSalaryK = salaryOfYearWith10PercentK - salaryOfYearK;
        System.out.println("Разнца годового дохода с повышением " + differenceSalaryM);
        System.out.println("Кристина теперь получает" + amountOf10PercentOfMonthSalaryK + "рублей.Годовой доход вырос на" + differenceSalaryK + "рублей");


        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Задача2");
        float one = 27.12f;
        System.out.println("Значение переменной с типом float равен" + one);
        long two = 987678965549L;
        System.out.println("Значение переменной с типом long равен " + two);
        float three = 2.786f;
        System.out.println("Значение переменной с типом float равен " + three);
        short four = 569;
        System.out.println("Значение переменной с типом short равен " + four);
        short five = -159;
        System.out.println("Значение переменной с типом short равен " + five);
        int six = 27897;
        System.out.println("Значение переменной с типом short равен " + six);
        byte seven = 67;
        System.out.println("Значение переменной с типом byte равен " + seven);


        System.out.println("Задача1");
        byte r = 125;
        System.out.println("Значениие переменной с типом byte равно" + r);
        short b = 20000;
        System.out.println("Значение переменной  с типом short равно" + b);
        int s = 1200000000;
        System.out.println("Значение переменной с типом int равно" + s);
        long i = 5000005757575757l;
        System.out.println("Значение переменной с типом long равно" + i);
        float f = 35.50f;
        System.out.println("Значение переменной с типом float равно" + f);
        double a = 5.60001233567890123456789000;
        System.out.println("Значение переменной с типом double равно" + a);


        System.out.println("Задача3");
        byte c = 23;
        byte h = 27;
        byte g = 30;
        int j = c + h + g;
        System.out.println(j + "Учеников всего");
        short y = 480;
        int w = y / j;
        System.out.println("На каждого ученика рассчитано "+ w +" листов бумаги");


        System.out.println("Задача7");
        byte kilograms = 7;
        short grams = 1000;
        int q = kilograms * grams;
        short m = 250;
        short k = 500;
        int with1MethodLosingWeight = q / m ;
        int with2MethodLosingWeight = q / k ;
        System.out.println(with1MethodLosingWeight+"дней уйдет на похудение, если спортсмен будет терять каждый"+m+ "по грамм ");
        System.out.println(with2MethodLosingWeight+"дней уйдет на похудение, если спортсмен будет терять каждый"+k+ "по грамм ");
        byte waysOfLoseWeight = 2 ;
        int daysForWeightLoss = with1MethodLosingWeight+with2MethodLosingWeight;
        int averageNumberToLoseWeight = daysForWeightLoss /  waysOfLoseWeight;
        System.out.println(averageNumberToLoseWeight+"дней в среднем уйдет на похудение");



        System.out.println("Задача5");
        byte paints = 120;
        byte white = 2;
        byte brown = 4;
        int paint = white + brown;
        System.out.println(paint);
        System.out.println(paint + "Красок уходит на один класс");
        int classes = paints / paint;
        System.out.println(classes + "Классов в школе");
        int brownPaint = classes * brown;
        int whitePaint = classes * white;
        System.out.println("Нужно " + brownPaint + "банок коричневой краски");
        System.out.println("Нужно " + whitePaint + "Банок белой краски");


        System.out.println("Задача6");
        byte weight1B = 80;
        byte bananas = 5;
        int totalWeightBananas = weight1B * bananas;
        System.out.println("Вес бананов" + totalWeightBananas + "грамм");
        short milk = 200;
        byte halfOfOneMilk1 = 100;
        byte weight1M = 105;
        int totalWeightMilk = milk / halfOfOneMilk1;
        int totalWeightOfMilkInGrams = totalWeightMilk * weight1M;
        System.out.println("Вес молока" + totalWeightOfMilkInGrams + "в граммах");
        byte iceCream = 2;
        byte iceCreamWeight = 100;
        int totalIceCreamWeight = iceCream * iceCreamWeight;
        System.out.println("Вес мороженого" + totalIceCreamWeight + "грамм");
        byte eggs = 4;
        byte weight1Egg = 70;
        int totalWeightEggs = eggs * weight1Egg;
        System.out.println("Вес яиц" + totalWeightEggs + "грамм");
        int totalWeightInGramms = totalWeightBananas + totalWeightOfMilkInGrams + totalIceCreamWeight + totalWeightEggs;
        System.out.println("Общий вес спортзавтрака в граммах" + totalWeightInGramms);
        int grPerKg = 1000;
        float weightKg = totalWeightInGramms / (float) grPerKg;
        System.out.println("Вес в килограммах" + weightKg);


        System.out.println("Задача4");
        byte bottlesFor2Minute = 16;
        int bottlesFor1Minute = bottlesFor2Minute / 2;
        System.out.println("Бутылок за 1 минуту " + bottlesFor1Minute);
        System.out.println("Бутылок за 2 минуты" + bottlesFor2Minute);
        int bottlesFor20Minute = bottlesFor1Minute * 20;
        System.out.println("За 20 минут машина произвела" + bottlesFor20Minute + "бутылок");
        System.out.println("Сутки равны 1440 минутам");
        short minuteForDay = 1440;
        int bottlesForDay = bottlesFor1Minute * minuteForDay;
        System.out.println("За сутки машина произвела" + bottlesForDay + "бутылок");
        int bottlesForThreeDay = bottlesForDay * 3;
        System.out.println("За три дня машина произвела" + bottlesForThreeDay + "бутылок");
        byte oneMonth = 30;
        int bottlesFor1Month = bottlesForDay * 30;
        System.out.println("За месяц машина произвела " + bottlesFor1Month + "бутылок");
        System.out.println("Разница годового дохода с повышением " + differenceSalaryD);
        System.out.println("Разница годового дохода с повышение " + differenceSalaryK);
        System.out.println("Маша теперь получает " + amountOf10PercentOfMonthSalaryM + "рублей.Годовой доход вырос на " + differenceSalaryM + "рублей");
        System.out.println("Денис теперь получает" + amountOf10PercentOfMonthSalaryD + "рублей.Годовой доход вырос на " + differenceSalaryD + "рублей");


        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.


         {

        }
    }
}