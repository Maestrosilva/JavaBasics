package JavaBasics.WhileLoopExercise;

import java.util.Scanner;

public class Cake_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int area = a * b;
        while(true){
            String cake = scanner.nextLine();
            if(cake.equals("STOP")){
                System.out.printf("%d pieces are left.", area);
                break;
            }
            int n = Integer.parseInt(cake);
            area -= n;
            if(area < 0){
                area = Math.abs(area);
                System.out.printf("No more cake left! You need %d pieces more.", area);
                break;
            }
        }
    }
}