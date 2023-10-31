package JavaBasics.ForLoopExercise;

import java.util.Scanner;

public class Oscars_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String actor = scanner.nextLine();
        double score = Double.parseDouble(scanner.nextLine());
        int jury = Integer.parseInt(scanner.nextLine());
        for(int i = 1; i<= jury; i ++){
            String name = scanner.nextLine();
            double points = Double.parseDouble(scanner.nextLine());
            score += name.length() * points / 2;
            if(score >= 1250.5){
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actor, score);
                return;
            }
        }
        double diff = Math.abs(score - 1250.5);
        System.out.printf("Sorry, %s you need %.1f more!", actor, diff);
    }
}