package ru.netology.stats;

public class StatsService {
    //1. Сумму всех продаж
    public int sumAll(long[] sales) {
        int sum = 0;

        for (long sale : sales) {
            sum = (int) (sum + sale);
        }
        return sum;
    }

    //2. Среднюю сумму продаж в месяц.
    public int average(long[] sales) {
        int average = 0;
        int sum = 0;
        for (long sale : sales) {
            sum = (int) (sum + sale);
        }
        average = sum / sales.length;
        return average;
    }

    //3. Номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму.
    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[maxMonth] - продажи в месяце maxMonth
            // sale - продажи в рассматриваемом месяце
            if (sales[maxMonth] <= sale) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    //4. Номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму
    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    // 5. Количество месяцев, в которых продажи были ниже среднего
    public int sumUnder(long[] sales) {
        int average = average(sales);
        int sumUnder = 0;
        for (long sale : sales) {
            if (sale < average) {
                sumUnder++;
            }
        }
        return sumUnder;
    }

    // 6. Количество  месяцев, в которых продажи были выше среднего
    public int sumUpper(long[] sales) {
        int average = average(sales);
        int sumUpper = 0;
        for (long sale : sales) {
            if (sale > average) {
                sumUpper++;
            }
        }
        return sumUpper;
    }
}
