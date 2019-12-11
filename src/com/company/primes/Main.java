package com.company.primes;

public class Main {
    public static void main(String[] args) {
        boolean isPrime = simplePrime(1103);
        System.out.println("Is the given number prime? " + isPrime);
    }

    static boolean simplePrime(int num) {
        int count = 0;

        for(int i = 2; i < num; i++){
            count++;
            if(num % i == 0){
                System.out.println("The program is executed: " + count + " times.");
                return false;
            }

        }
        System.out.println("The program is being executed " + count + " times.");
        return true;

    }
}