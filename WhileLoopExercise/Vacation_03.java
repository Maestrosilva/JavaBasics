package JavaBasics.WhileLoopExercise;

import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double need = Double.parseDouble(scanner.nextLine());
        double stock = Double.parseDouble(scanner.nextLine());
        int days = 0;
        int spendDays = 0;
        while (true){
            days++;
            String operate = scanner.nextLine();
            double cash = Double.parseDouble(scanner.nextLine());
            switch (operate){
                case "spend":
                    stock -= cash;
                    if(stock < 0){
                        stock = 0;
                    }
                    spendDays++;
                    break;
                case "save":
                    stock += cash;
                    spendDays = 0;
                    break;
            }
            if(spendDays == 5){
                System.out.println("You can't save the money.");
                System.out.println(days);
                return;
            }
            if(need <= stock){
                System.out.printf("You saved the money for %d days.", days);
                break;
            }
        }
    }
}