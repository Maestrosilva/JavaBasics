package JavaBasics.WhileLoopExercise;

import java.util.Scanner;

public class Walking_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int steps = 0;
        int go;
        while (steps < 10000){
            String going = scanner.nextLine();
            if(going.equals("Going home")){
                go = Integer.parseInt(scanner.nextLine());
                steps += go;
                break;
            }
            go = Integer.parseInt(going);
            steps += go;
        }
        int diff = Math.abs(steps - 10000);
        if(steps >= 10000){
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", diff);
        }
        else{
            System.out.printf("%d more steps to reach goal.", diff);
        }
    }
}