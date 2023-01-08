package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void ShouldFindSumSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSum = 180;
        int actualSum = service.sumSales(sales);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void ShouldFindAverageSale() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAverage = 15;
        int actualAverage = service.averageSale(sales);
        Assertions.assertEquals(expectedAverage, actualAverage);
    }

    @Test
    public void ShouldFindMaxMonthSales() {
        StatsService service = new StatsService();
        long[] maxMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMaxMonth = 8;
        long actualMaxMonth = service.maxSales(maxMonth);
        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);
    }

    @Test
    public void ShouldFindMinMonthSales() {
        StatsService service = new StatsService();
        long[] minMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMinMonth = 9;
        long actualMinMonth = service.minSales(minMonth);
        Assertions.assertEquals(expectedMinMonth, actualMinMonth);
    }

    @Test
    public void ShouldFindSumMinMonthSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSumMinMonth = 5;
        int actualSumMinMonth = service.sumMinMonthCalc(sales);
        Assertions.assertEquals(expectedSumMinMonth, actualSumMinMonth);
    }

    @Test
    public void ShouldFindSumMaxMonthSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSumMaxMonth = 5;
        int actualSumMaxMonth = service.sumMaxMonthCalc(sales);
        Assertions.assertEquals(expectedSumMaxMonth, actualSumMaxMonth);
    }
}
