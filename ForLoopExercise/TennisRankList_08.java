package JavaBasics.ForLoopExercise;

import java.util.Scanner;

public class TennisRankList_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int firstScore = Integer.parseInt(scanner.nextLine());
        int tournamentSum = 0;
        double wins = 0;
        for(int i = 0; i < n; i++){
            String game = scanner.nextLine();
            switch (game){
                case "W":
                    tournamentSum += 2000;
                    wins++;
                    break;
                case "F":
                    tournamentSum += 1200;
                    break;
                case "SF":
                    tournamentSum += 720;
                    break;
            }
        }
        double winPercentage = wins / n * 100;
        int average = tournamentSum / n;

        System.out.printf("Final points: %d%n", firstScore + tournamentSum);
        System.out.printf("Average points: %d%n", average);
        System.out.printf("%.2f%%%n", winPercentage);
    }
}