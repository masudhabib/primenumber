package com.company.primes;

public class primeWithOdd {
    public static void main(String[] args) {
        boolean isPrime = primesWithOdd(1103);
        System.out.println("Is the given number prime? " + isPrime);
    }

    static boolean primesWithOdd(int num) {

        int count = 0;

        for(int i = 3; i < num/2; i+=2){
            count++;
            if(num % i == 0){
                System.out.println("the program is being executed " + count + " times.");
                return false;
            }
        }
        System.out.println("the program is being executed " + count + " times.");
        return true;
    }
}
