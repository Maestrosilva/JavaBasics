package JavaBasics.ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class HotelRoom_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        double studioPrice = 0;
        double apartmentPrice = 0;
        switch (month){
            case "May":
            case "October":
                studioPrice = 50;
                apartmentPrice = 65;
                if(days > 7 && days <= 14){
                    studioPrice *= 0.95;
                }
                else if(days > 14){
                    studioPrice *= 0.7;
                }
                break;
            case "June":
            case "September":
                studioPrice = 75.2;
                apartmentPrice = 68.7;
                if(days > 14){
                    studioPrice *= 0.8;
                }
                break;
            case "July":
            case "August":
                studioPrice = 76;
                apartmentPrice = 77;
        }
        if(days > 14){
            apartmentPrice *= 0.9;
        }
        apartmentPrice *= days;
        studioPrice *= days;
        System.out.println(String.format("Apartment: %.2f lv.", apartmentPrice));
        System.out.println(String.format("Studio: %.2f lv.", studioPrice));
    }
}