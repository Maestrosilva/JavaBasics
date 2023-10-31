package JavaBasics.ForLoopExercise;

import java.util.Scanner;

public class TrekkingMania_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = Integer.parseInt(scanner.nextLine());
        double Musala = 0;
        double Monblan = 0;
        double Kilimanjaro = 0;
        double K2 = 0;
        double Everest = 0;
        double sum = 0;
        for(int i = 0; i < n; i++){
            int group = Integer.parseInt(scanner.nextLine());
            sum += group;
            if(group <= 5){
                Musala += group;
            }
            else if(group <= 12){
                Monblan += group;
            }
            else if(group <= 25){
                Kilimanjaro += group;
            }
            else if(group <= 40){
                K2 += group;
            }
            else{
                Everest += group;
            }
        }
        double MusalaPercent = Musala / sum * 100;
        double MonblanPercent = Monblan / sum * 100;
        double KilimanjaroPercent = Kilimanjaro / sum * 100;
        double K2Percent = K2 / sum * 100;
        double EverestPercent = Everest / sum * 100;
        System.out.printf("%.2f%%%n", MusalaPercent);
        System.out.printf("%.2f%%%n", MonblanPercent);
        System.out.printf("%.2f%%%n", KilimanjaroPercent);
        System.out.printf("%.2f%%%n", K2Percent);
        System.out.printf("%.2f%%%n", EverestPercent);
    }
}