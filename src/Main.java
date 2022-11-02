public class Main {
    public static void main(String[] args) {

        System.out.println("Задание № 1");

        int salaryMonth = 15000;
        int salarySum = 0;
        int month1 = 1;
        int monthAll1 = 0;
        while (salarySum <= 2459000) {
            salarySum = salarySum+salaryMonth + (salaryMonth/100);
            monthAll1 = monthAll1 + month1;
            System.out.println("сумма " + salarySum);
            System.out.println("количество месяцев " + monthAll1);
        }

        System.out.println("Задание № 2");

        int i = 0;

        while (i < 10) {
            i = i +1;
            System.out.print(i + " ");
        }

        System.out.println();

        for (i = 10; i >= 1; i--)
        {

            System.out.print(i + " ");
        }

        System.out.println("Задание № 3");

        int y = 12_000_000;
        int birth = y / 1000 * 17;
        int rateMortality = y / 1000 * 8;
        int year = 0;
        while (year < 10) {
            year = year + 1;
            y = y + (birth-rateMortality);
            System.out.println("Год " + year +  " численность населения составляет " + y);
        }

        System.out.println("Задание № 4");

        int savingsAccount = 15000;
        int month2 = 0;
        while (month2 < 108) {
            savingsAccount = savingsAccount + (savingsAccount/100*7);
            month2 = month2 + 1;
            if (month2 % 6 == 0 )
            {
                System.out.println(savingsAccount + " " + month2 );
            }

        }

        System.out.println("Задание № 5");

        int FirstFridayInMonth = 2;                        // 2 число первая пятница месяца КАК ВЫВЕСТИ 2 В КОНСОЛЬ?

        while (FirstFridayInMonth< 31) {

            FirstFridayInMonth = FirstFridayInMonth +7;

            if (FirstFridayInMonth < 31) {
                System.out.println("Сегодня пятница "+ FirstFridayInMonth + " -е число. Необходимо подготовить отчет.");
            }


        }

        System.out.println("Задание № 6");

        int cometaTime = 0;

        while (cometaTime <= 3000) {
            cometaTime = cometaTime + 79;
            if (cometaTime >= 1822 && cometaTime <= 2122) {
                System.out.println(cometaTime);
            }

        }

        System.out.println("Задание № 7");

        int multiplier = 0;
        int sum = 0;
        while (multiplier < 10) {
           multiplier = multiplier +1;
           sum = multiplier * 2;

            System.out.println("2" + " * " + multiplier + " = " + sum);
        }
























    }}
