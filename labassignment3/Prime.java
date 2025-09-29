package labassignment3;

import java.util.*;
import java.util.Scanner;


class NumberIsZeroException extends Exception {
 public NumberIsZeroException(String message) {
     super(message);
 }
}

public class Prime {
 // Method to check if a number is prime
 public static boolean isPrime(int number) {
     if (number <= 1) return false;
     for (int i = 2; i <= Math.sqrt(number); i++) {
         if (number % i == 0) return false;
     }
     return true;
 }

 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     try {
         System.out.print("Enter a number: ");
         int number = scanner.nextInt();

         // Check if the number is zero
         if (number == 0) {
             throw new NumberIsZeroException("Number is 0");
         }

         // Check if the number is prime
         if (isPrime(number)) {
             System.out.println(number + " is a prime number.");
         } else {
             System.out.println(number + " is not a prime number.");
         }

     } catch (NumberIsZeroException e) {
         System.out.println("Exception: " + e.getMessage());
     } catch (Exception e) {
         System.out.println("Invalid input! Please enter a valid integer.");
     } finally {
         scanner.close();
     }
 }
}


