package com.tymanuan.task1.service;
import com.tymanuan.task1.entity.Array;
public class Sort {


    public class SearchService {

        private Array array;

        public SearchService(Array array) {
            this.array = array;
        }

        public int findMin() {
            int min = Integer.MAX_VALUE;
            for (int item: array) {
                if (item < min) {
                    min = item;
                }
            }
            return min;
        }

        public int findMax() {
            int max = Integer.MIN_VALUE;
            for (int item: array) {
                if (item > max) {
                    max = item;
                }
            }
            return max;
        }

    }
}
