package JavaBasics.FirstStepsInCodingLab;

import java.util.Scanner;

public class PetShop_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dogs = Integer.parseInt(scanner.nextLine());
        int cats = Integer.parseInt(scanner.nextLine());
        double total = dogs * 2.5 + cats * 4;
        System.out.printf("%.1f.",total);
    }
}