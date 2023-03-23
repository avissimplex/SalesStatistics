package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    //1. Тестируем сумму всех продаж
    @Test
    public void shouldFindSum() {
        StatsService service = new StatsService();

        long[] temps = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 180;
        int actualSum = service.sumAll(temps);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    // 2. Тестируем среднюю сумму продаж в месяц
    @Test
    public void shouldFindAverage() {
        StatsService service = new StatsService();

        long[] temps = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAverage = 15;
        int actualAverage = service.average(temps);

        Assertions.assertEquals(expectedAverage, actualAverage);
    }

    // 3. Тестируем номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму.
    @Test
    public void shouldFindMaxSales() {
        StatsService service = new StatsService();

        long[] temps = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedmaxSales = 8;
        int actualmaxSales = service.maxSales(temps);

        Assertions.assertEquals(expectedmaxSales, actualmaxSales);
    }

    // 4. Номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму
    @Test
    public void shouldFindMinSales() {
        StatsService service = new StatsService();

        long[] temps = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedminSales = 9;
        int actualminSales = service.minSales(temps);

        Assertions.assertEquals(expectedminSales, actualminSales);
    }

    // 5. Количество месяцев, в которых продажи были ниже среднего
    @Test
    public void shouldFindSumUnder() {
        StatsService service = new StatsService();

        long[] temps = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSumUnder = 5;
        int actualSumUnder = service.sumUnder(temps);

        Assertions.assertEquals(expectedSumUnder, actualSumUnder);
    }

    // 6. Количество месяцев, в которых продажи были выше среднего
    @Test
    public void shouldFindSumUpper() {
        StatsService service = new StatsService();

        long[] temps = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSumUpper = 5;
        int actualSumUpper = service.sumUpper(temps);

        Assertions.assertEquals(expectedSumUpper, actualSumUpper);
    }
}

