public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();

}
    public static void task1() {
        System.out.println(" Задача 1 ");
        int savings = 0;
        int monthlySavings = 15000;
        int targetSavings = 2459000;
        int months = 0;

        while (savings < targetSavings) {
            savings += monthlySavings;
            months++;
            System.out.printf("Месяц %d, сумма накоплений равна %d рублей%n", months, savings);
        }
        }
        public static void task2(){
            System.out.println(" задача 2");
            int i = 1;
            while (i <= 10) {
                System.out.print(i + " ");
                i++;
            }
            System.out.println();

            for (int j = 10; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();

        }
        public static void task3() {
            int population = 12_000_000; // начальное население
            double birthRate = 0.017; // рождаемость
            double deathRate = 0.008; // смертность
            int years = 10; // количество лет

            for (int i = 1; i <= years; i++) {
                population += (int) (population * (birthRate - deathRate));
                System.out.println(" Год " + i + " численность население состоявляет " + population);
            }
        }

            public static void task4() {
                double initialAmount = 15_000; // начальная сумма вклада
                double targetAmount = 12_000_000; // целевая сумма
                double interestRate = 0.07; // процентная ставка
                int months = 0; // количество месяцев
                double savings = initialAmount; // накопления

                while (savings < targetAmount) {
                    savings += savings * interestRate;
                    months++;
                    System.out.println(" Месяц " + months + " Сумма накоплений " + savings);
                }
            }
            public static void task5() {
                double initialAmount = 15_000; // начальная сумма вклада
                double targetAmount = 12_000_000; // целевая сумма
                double interestRate = 0.07; // процентная ставка
                int months = 0; // количество месяцев
                double savings = initialAmount; // накопления

                while (savings < targetAmount) {
                    savings += savings * interestRate;
                    months++;
                    System.out.println(" Месяц " + months + " Сумма накоплений " + savings);
                    if (months % 6 == 0) {
                        System.out.println(" Для суммы накоплений если считать каджый 6 месяц " + months + " понадобиться  " + savings);
                    }
                }
                System.out.println(" Для накопления суммы " + targetAmount + " понадобиться " + months + " месяцев");
            }
            public static void task6() {
                int savings = 15000; // начальная сумма накоплений
                double interestRate = 0.07; // процентная ставка банка
                int monthsInYear = 12; // количество месяцев в году
                int years = 9; // количество лет, на протяжении которых копит Василий
                int halfYears = years * 2; // количество полугодий
                int monthsInHalfYear = monthsInYear / 2; // количество месяцев в полугодии

                // рассчитываем накопления за каждое полугодие
                for (int i = 1; i <= halfYears; i++) {
                    // добавляем проценты за каждый месяц полугодия
                    for (int j = 1; j <= monthsInHalfYear; j++) {
                        savings += savings * interestRate;
                    }
                    // выводим результат
                    System.out.println("Накопления за " + i + "-е полугодие: " + savings + " рублей");
                }
            }

        }
