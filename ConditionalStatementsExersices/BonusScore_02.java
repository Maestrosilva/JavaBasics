package JavaBasics.ConditionalStatementsExersices;

import java.util.Scanner;

public class BonusScore_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = Integer.parseInt(scanner.nextLine());
        double bonusScore = 0;
        if(score <= 100) {
            bonusScore = 5;
        }
        if(score > 100) {
            bonusScore = score * 0.2;
        }
        if(score > 1000) {
            bonusScore = score * 0.1;
        }
        if (score % 2 == 0) {
            bonusScore += 1;
        }
//        if (score % 10 == 5){
//            bonusScore += 2;
//        }
        if (score % 5 == 0 && score % 2 != 0){
            bonusScore += 2;
        }
        System.out.println(bonusScore);
        System.out.println(bonusScore + score);
    }
}