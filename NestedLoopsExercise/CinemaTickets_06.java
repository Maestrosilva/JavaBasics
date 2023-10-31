package JavaBasics.NestedLoopsExercise;

import java.util.Scanner;

public class CinemaTickets_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double standard = 0;
        double student = 0;
        double kid = 0;
        double tickets = 0;
        String name = scanner.nextLine();
        while(!name.equals("Finish")){
            double seats = 0;
            double places = Integer.parseInt(scanner.nextLine());
            for(int i = 0; i < places; i++){
                String ticket = scanner.nextLine();
                if(ticket.equals("End")){
                    break;
                }
                tickets ++;
                seats ++;
                switch (ticket){
                    case "student":
                        student ++;
                        break;
                    case "standard":
                        standard ++;
                        break;
                    case "kid":
                        kid ++;
                        break;
                }
            }
            double percent = seats / places * 100;
            System.out.printf("%s - %.2f%% full.%n", name, percent);
            name = scanner.nextLine();
        }
        double perStudent = student / tickets * 100;
        double perStandard = standard / tickets * 100;
        double perKid = kid / tickets * 100;
        System.out.printf("Total tickets: %.0f%n", tickets);
        System.out.printf("%.2f%% student tickets.%n", perStudent);
        System.out.printf("%.2f%% standard tickets.%n", perStandard);
        System.out.printf("%.2f%% kids tickets.%n", perKid);
    }
}