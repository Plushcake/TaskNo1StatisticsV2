package ru.netology.stats;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @org.junit.jupiter.api.Test
        //Сумму всех продаж
    void shouldCalcSumAll() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;

        long actual = service.calcSumAll(sales);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
        //Средняя сумма продаж
    void shouldСalcSumAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;

        long actual = service.calcSumAverage(sales);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
        // Практика по видео
    void shouldCalcSumMax() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 20;

        long actual = service.calcSumMax(sales);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
        //Номер месяца, в котором был пик продаж
    void shouldMaxSalessMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;

        long actual = service.maxSalessMonth(sales);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
        //Номер месяца, в котором был минимум продаж
    void shouldMinSalessMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = service.minSalessMonth(sales);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
        //Кол-во месяцев, в которых продажи были ниже среднего
    void shouldBelowAverageSaless() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        //long actual = service.calcSumAverage(sales);


        long actual = service.belowAverageSaless(sales);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
        //Кол-во месяцев, в которых продажи были ниже среднего
    void shouldAboveAverageSaless() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = service.aboveAverageSaless(sales);

        assertEquals(expected, actual);
    }


    //Кол-во месяцев, в которых продажи были выше среднего
}