package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void TotalSalesTest() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.sum(sales);
        long expected = 180;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void AverageMonthlySalesTest() {
        StatsService service = new StatsService();
        long[] sales = {180};
        long actual = service.average(sales);
        long expected = 15;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxSalesMonthTest() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.maxSales(sales);
        long expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minSalesMonthTest() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.minSales(sales);
        long expected = 9;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void countBelowAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.countBelowAverage(sales);
        long expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void countAboveAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.countAboveAverage(sales);
        long expected = 5;

        Assertions.assertEquals(expected, actual);
    }
}