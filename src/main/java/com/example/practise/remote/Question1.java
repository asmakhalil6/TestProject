package com.example.practise.remote;

import java.util.List;

public class Question1 {


    public Integer findKthElement(List<Integer> numbers, int kth) {

        List<Integer> sortedArray = sortArray(numbers);
        return sortedArray.get(kth-1);

    }

    private List<Integer> sortArray(List<Integer> numbers) {

        for (int i = 0; i < numbers.size(); i++) {
            for (int j = i + 1; j < numbers.size(); j++) {
                if (numbers.get(i) < numbers.get(j)) {
                    int temp = numbers.get(i);
                    numbers.set(i, numbers.get(j));
                    numbers.set(j, temp);
                }
            }
        }

        return numbers;
    }
}
