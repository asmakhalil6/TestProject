package com.example.practise;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PractiseApplication implements ApplicationRunner {

    public static void main(String[] args) {
        SpringApplication.run(PractiseApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        int largestPrime = findLargestPrime(1234567);
        System.out.println(largestPrime);
    }

    public int findLargestPrime(int n) {
        int largestPrime = 0;
        int[] array = convertIntToArray(n);
        for (int i : array) {
            if (isPrime(i) && i >= largestPrime) ;
            {
                largestPrime = i;
            }
        }
        return largestPrime;
    }


    public boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int[] convertIntToArray(int number) {
        String temp = Integer.toString(number);
        int[] intArray = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            intArray[i] = temp.charAt(i) - '0';
        }
        return intArray;
    }


}
