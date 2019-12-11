package com.company.prime.primes;

public class Main {
    public static void main(String[] args) {
        simplePrime();
    }

    private static void simplePrime() {
        int num = 1103;
        boolean isPrime = true;
        int count = 0;

        for(int i = 2; i < num; i++){
            if(num % i == 0){
                isPrime = false;
            }
            count++;
        }
        System.out.println("The program is being executed " + count + " times.");

        if(isPrime){
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }
    }
}