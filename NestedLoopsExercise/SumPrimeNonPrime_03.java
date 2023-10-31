package JavaBasics.NestedLoopsExercise;

import java.util.Scanner;

public class SumPrimeNonPrime_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        int sumPrime = 0;
        int sumNonPrime = 0;
        while (!num.equals("stop")){
            boolean isPrime = true;
            int number = Integer.parseInt(num);
            if(number < 0){
                System.out.println("Number is negative.");
            }
            for (int i = 1; i <= number; i++) {
                if (i == 1 || i == number) {
                } else {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if(isPrime && number > 0){
                sumPrime += number;
            }
            else if(!isPrime){
                sumNonPrime += number;
            }
            num = scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d%n", sumPrime);
        System.out.printf("Sum of all non prime numbers is: %d%n", sumNonPrime);
    }
}