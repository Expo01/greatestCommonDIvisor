package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(9,10));
        System.out.println(getGreatestCommonDivisor(10,9));
        System.out.println(getGreatestCommonDivisor(12,30));
        System.out.println(getGreatestCommonDivisor(200,400));
    }

    public static int getGreatestCommonDivisor(int x, int y){
        if (x < 10 || y < 10 ){
            return -1;
        }

        if (x > y){
            int storeX = x;
            x = y;
            y = storeX;
        }
        int greatestCommonDivisor = 1;
        for (int i = 2; i < y/2; i++){
            if (x % i == 0 &&  y % i == 0){
                greatestCommonDivisor = i;
            }
        }
        return greatestCommonDivisor;
    }
}
