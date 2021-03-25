package com.tymanuan.task1.service;
import com.tymanuan.task1.entity.Array;
import java.util.function.Predicate;



public class Calculation {
    private Array array;

    public Calculation(Array array) {
        this.array = array;
    }

    public void replaceByCondition(int replaced, Predicate<Integer> condition) {
        for (int i = 0; i < array.length(); i++) {
            if (condition.test(array.get(i))) {
                array.set(i, replaced);
            }
        }
    }

    public int getSum() {
        int sum = 0;
        for (int item: array) {
            sum += item;
        }
        return sum;
    }

    public double getAverage() {
        return (double) getSum() / array.length();
    }

    public int countPositive() {
        int amount = 0;
        for (int item: array) {
            if (item > 0) {
                amount++;
            }
        }
        return amount;
    }

    public int countNegative() {
        int amount = 0;
        for (int item: array) {
            if (item < 0) {
                amount++;
            }
        }
        return amount;
    }
}



