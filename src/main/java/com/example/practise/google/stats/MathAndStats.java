package com.example.practise.google.stats;

public class MathAndStats {


    public boolean isNumberValid(String input) {

        boolean isNumberValid = true;
        int dotCount = 0;
        char[] array = input.toCharArray();

        for (int i = 0; i < array.length; i++) {

            if ((i == 0 || i == array.length - 1) && array[i] == '.') {
                isNumberValid = false;
                break;
            } else if (i != 0 && i != array.length - 1) {
                if (array[i] == '.' && !(array[i + 1] >= '0' || array[i + 1] <= '9')) {
                    isNumberValid = false;
                    break;
                }
                if (array[i] == '.') {
                    dotCount = dotCount + 1;
                }

                if (dotCount > 1) {
                    isNumberValid = false;
                    break;
                }
            }
        }
        return isNumberValid;
    }

}
