package com.springframework.testJUnutTest;

public class Culculation {

    public int sum(int[] numbers){
        int sum=0;
        for (int i = 0; i<numbers.length;i++ ) {
            sum = sum + numbers[i];
        }
        return sum;
    }

    public int subscription(int num1, int num2){
        int sum = num1 - num2;

        return sum;
    }

    public Boolean isEven(int num){
        if (num%2 == 0)
            return true;
        else return false;
    }
    public int[] reverseArray(int[] numbers){
        int[] revNumbers = new int[numbers.length];
        int j=0;
        for (int i =numbers.length-1;i>=0;i--) {
            revNumbers[j] = numbers[i];
            j++;
        }

        return revNumbers;
    }


}
