package com.bridgelabz.dataStructureAndAlgorithmPrograms;
import java.util.Scanner;
public class PrimeNumber {
    void primeNumber() {
        int a, b, flag, i;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Start value: ");
        a = scanner.nextInt();
        System.out.print("Enter End value: ");
        b = scanner.nextInt();
        System.out.print("prime numbers between " + a + " and " + b + " are: ");
        while (a < b) {
            flag = 0;
            for (i = 2; i <= a / 2; ++i) {
                if (a % i == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0)
                System.out.print(a + " ");
            ++a;
        }
    }
    public static void main(String args[]) {
        PrimeNumber prime = new PrimeNumber();
        prime.primeNumber();
    }
}
