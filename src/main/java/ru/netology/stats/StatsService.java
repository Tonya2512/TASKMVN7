package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;
        }
        return totalSale;
    }

    public long average(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;
        }
        long averageSale = totalSale / 12;
        return averageSale;
    }

    public int monthMaximum(long[] sales) {
        int monthMaximumSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[monthMaximumSales]) {
                monthMaximumSales = i;
            }
        }
        return monthMaximumSales + 1;
    }

    public int monthMinimum(long[] sales) {
        int monthMinimumSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[monthMinimumSales]) {
                monthMinimumSales = i;
            }
        }
        return monthMinimumSales + 1;
    }

    public int monthBellowAverage(long[] sales) {
        int counter = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale < averageSale) {
                counter++;
            }
        }
        return counter;
    }

    public int monthAboveAverage(long[] sales) {
        int counter = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale > averageSale) {
                counter++;
            }
        }
        return counter;
    }
}

