package JavaBasics.WhileLoopExercise;

import java.util.Scanner;

public class Coins_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = Double.parseDouble(scanner.nextLine());
        double cent = sum * 100;
        int monet = 0;
        while(cent > 0){
            cent = Math.round(cent);
            if(cent >= 200){
                cent -= 200;
                monet++;
            }
            else if(cent >= 100){
                cent -= 100;
                monet++;
            }
            else if(cent >= 50){
                cent -= 50;
                monet++;
            }
            else if(cent >= 20){
                cent -= 20;
                monet++;
            }
            else if(cent >= 10){
                cent -= 10;
                monet++;
            }
            else if(cent >= 5){
                cent-= 5;
                monet++;
            }
            else if(cent >= 2){
                cent -= 2;
                monet++;
            }
            else{
                cent -= 1;
                monet++;
            }
        }
        System.out.println(monet);
    }
}