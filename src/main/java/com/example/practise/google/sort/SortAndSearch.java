package com.example.practise.google.sort;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortAndSearch {

    public List<Integer> findKthElementLowestAndLargestIndex(List<Integer> input, int kth) {
        Map<Integer, List<Integer>> rsut = new HashMap<>();

        for (int i = 0; i < input.size(); i++) {
            if (rsut.get(input.get(i)) == null) {
                rsut.put(input.get(i), Arrays.asList(i));
            } else {
                rsut.get(input.get(i)).add(i);
            }
        }
        return rsut.get(kth);
    }


}
