package code._4_student_effort.Challenge2;

import code._2_challenge._2_strategy.BubleSort;
import code._2_challenge._2_strategy.MergeSort;
import code._2_challenge._2_strategy.SortingStrategy;

import java.util.Arrays;

public class StrategyExample {

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{3, 4, 5, 2};
        Integer[] copy01OfArr = Arrays.copyOf(arr, arr.length);
        Integer[] copy02OfArr = Arrays.copyOf(arr, arr.length);

        displaySorted(new BubleSort(), copy01OfArr);
        displaySorted(new MergeSort(), copy02OfArr);
    }

    public static void displaySorted(SortingStrategy strategy, Integer[] arr) {
        strategy.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
