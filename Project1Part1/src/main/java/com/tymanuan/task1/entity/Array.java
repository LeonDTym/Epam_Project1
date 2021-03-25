package com.tymanuan.task1.entity;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import javax.persistence.Entity;
import java.util.Arrays;
import java.util.Iterator;

@Entity

public class Array implements Iterable<Integer> {
    public static void main(String[] args){}
    private int[] array;
            public Array(int[] array) {
            this.array = array;
        }

        public int[] getArray() {
            return array;
        }

        public void setArray(int[] array) {
            this.array = array;
        }

        public int get(int index)  { //TODO throws
            return array[index];
        }

        public void set(int index, int value) { //TODO throws
            array[index] = value;
        }

        public int length() {
            return array.length;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Array intArray = (Array) o;
            return Arrays.equals(array, intArray.array);
        }

        @Override
        public int hashCode() {
            return Arrays.hashCode(array);
        }

        @Override
        public String toString() {
            return "IntArray{" +
                    "array=" + Arrays.toString(array) +
                    '}';
        }

        @Override
        public Iterator<Integer> iterator() {
            return new Iterator<Integer>() {

                private int currentIndex = 0;

                @Override
                public boolean hasNext() {
                    return currentIndex < array.length;
                }

                @Override
                public Integer next() {
                    return array[currentIndex++];
                }
            };
        }

    }
       /* public static void main(String[] args) {
            Calculation calculation = new Calculation();
            calculation.setName("Anakin");
            calculation.setLastName("Skywalker");

            userLogger.info(calculation.showMeMessage());
            userLogger.info(calculation.giveMeASign());

            rootLogger.info("Root Logger: "  + calculation.showMeMessage());

            //debug
            if (rootLogger.isDebugEnabled()) {
                rootLogger.debug("RootLogger: In debug message");
                userLogger.debug("UserLogger in debug");
            }

            try {
                Calculation userNull = new Calculation();
                userNull.getName().toString();
            } catch (NullPointerException ex) {
                userLogger.error("error message: " + ex.getMessage());
                userLogger.fatal("fatal error message: " + ex.getMessage());
            }


        }*/


