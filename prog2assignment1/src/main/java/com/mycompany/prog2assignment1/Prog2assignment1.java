

package com.mycompany.prog2assignment1;

import java.util.Scanner;

public class Prog2assignment1 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            System.out.print("A[" + (i + 1) + "]= ");
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter number to check it's occurrence: ");
        int num = scanner.nextInt();

        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (arr[i] == num) {
                count++;
            }
        }
        System.out.println("The element " + num + " is repeated " + count + " times.");
    }
}
