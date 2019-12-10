package com.company;

import java.util.Random;
import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {

        int num = 1103;
        int count = 0;
        boolean isPrime = true;

        for(int i =2; i <= num/2; i++) {
            if (num % i == 0) {
                isPrime = false;
            }
            count++;

        }
        System.out.println("the number of time that the program is being executed: " + count);

        if(isPrime){
            System.out.println( num + " is a prime number.");
        } else{
            System.out.println(num + " is not a prime number");
        }
    }





}




//
//
//
//    }
//}




//    public static void sumOddRandomNumber() {
////        int array[] = new int[10];
////        Random rand = new Random();
//        int arr[] = {1,3,4,7,8};
//        int oddSum = 0;
//
//        for (int i = 0; i < arr.length; i++) {
////            arr[i] = rand.nextInt();
//            if(arr[i] % 2 == 0)
//                oddSum += arr[i];
//            System.out.print(arr[i] + "\t"); //why is the negative number not adding
//
//        }
//        System.out.println("the sum of odd random numbers are: "+ oddSum);
//    }
