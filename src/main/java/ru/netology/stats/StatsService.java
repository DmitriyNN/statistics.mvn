package ru.netology.stats;

import org.jetbrains.annotations.NotNull;

public class StatsService {
    public int sumSales(int[] sales) {
        int sum = 0;
        for (int monthSale : sales) {
            sum += monthSale;
        }
        return sum;
    }

    public int averageSale(int[] sales) {
        int average = sumSales(sales) / sales.length;
        return average;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int sumMinMonthCalc(int[] sales) {
        int counter = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSale(sales)) {
                counter++;
            }
        }
        return counter;
    }

    public int sumMaxMonthCalc(int[] sales) {
        int counter = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSale(sales)) {
                counter++;
            }
        }
        return counter;
    }
}

