package JavaBasics.NestedLoopsExercise;

import java.util.Scanner;

public class TrainTheTrainers_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int presentations = 0;
        double averagePR = 0;
        double totalSumRate = 0;
        String name = scanner.nextLine();
        while(!name.equals("Finish")){
            double rateSum = 0;
            presentations ++;
            for(int i = 0; i < n; i++){
                double rate = Double.parseDouble(scanner.nextLine());
                rateSum += rate;
            }
            averagePR = rateSum / n;
            totalSumRate += averagePR;
            System.out.printf("%s - %.2f.%n", name, averagePR);
            name = scanner.nextLine();
        }
        double averageALL = totalSumRate / presentations;
        System.out.printf("OOP.Abstraction.Lab_03_StudentSystem.Student's final assessment is %.2f.%n", averageALL);
    }
}