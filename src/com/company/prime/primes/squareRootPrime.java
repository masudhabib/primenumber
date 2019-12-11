package com.company.prime.primes;

public class squareRootPrime {
    public static void main(String[] args) {
        squareRootsPrime();
    }

    private static void squareRootsPrime() {
        int num = 1103;
        boolean isPrime = true;
        int count = 0;

        for(int i = 3; i < Math.sqrt(num); i++){
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
