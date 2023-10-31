package JavaBasics.WhileLoopExercise;

import java.util.Scanner;

public class Moving_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        int volume = a * b * c;
        String move;
        while (volume > 0){
            move = scanner.nextLine();
            if(move.equals("Done")){
                break;
            }
            int boxes = Integer.parseInt(move);
            volume -= boxes;
        }
        int diff = Math.abs(volume);
        if(volume < 0){
            System.out.printf("No more free space! You need %d Cubic meters more.", diff);
        }
        else{
            System.out.printf("%d Cubic meters left.", diff);
        }
    }
}