package com.example.practise;

import com.example.practise.interview.Interview;
import org.junit.Assert;
import org.junit.Test;

public class InterviewTest {

    @Test
    public void sumTest() {
        Interview interview = new Interview();
        int result = interview.sum(4, 5);
        Assert.assertEquals(9, result);
    }

    @Test
    public void twoSum() {
        Interview interview = new Interview();
       int[] nums =  {2,4,5};
        int[] result = interview.twoSum(nums, 7);
        Assert.assertEquals(0, result[0]);
        Assert.assertEquals(2, result[1]);
    }

}
