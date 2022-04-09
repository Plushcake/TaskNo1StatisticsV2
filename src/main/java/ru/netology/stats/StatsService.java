package ru.netology.stats;

public class StatsService {

    public long calcSumAll(long[] sales) { //Сумму всех продаж
        long sum = 0;
        for (long sale : sales) {
            //sum = sum + sale;
            sum += sale;
        }
        return sum;
    }

    public long calcSumAverage(long[] sales) { //Средняя продажа
        long sum = this.calcSumAll(sales);
        return sum / sales.length;
    }

    public long calcSumMax(long[] sales) { //Практика по видео
        long monthMax = sales[0];
        for (long sale : sales) {
            if (monthMax < sale) {
                monthMax = sale;
            }
        }
        return monthMax;
    }

    public int maxSalessMonth(long[] sales) { //Номер месяца, в котором был пик продаж "Второй вариант решения условия"
        int maxMonth = 0;
        for (int month = 0; month < sales.length; month++) {
            if (sales[month] >= sales[maxMonth]) {
                maxMonth = month;
            }
        }
        return maxMonth + 1;
    }

    public int minSalessMonth(int[] sales) { //Номер месяца, в котором был минимум продаж "Первый вариант решения условия"
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int belowAverageSaless(long[] sales) {
        long average = calcSumAverage(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale < average) {
                count++;
            }
        }
        return count;
    }

    public int aboveAverageSaless(long[] sales) { // Кол-во месяцев, в которых продажи были выше среднего
        long average = calcSumAverage(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale > average) {
                count++;
            }
        }
        return count;
    }
}

//Кол-во месяцев, в которых продажи были ниже среднего

// Кол-во месяцев, в которых продажи были выше среднего
