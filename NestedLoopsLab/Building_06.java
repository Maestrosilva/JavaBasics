package JavaBasics.NestedLoopsLab;

import java.util.Scanner;

public class Building_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int floors = Integer.parseInt(scanner.nextLine());
        int rooms = Integer.parseInt(scanner.nextLine());
        for(int i = 0; i < rooms; i++){
            System.out.printf("L%d%d ", floors, i);
        }
        System.out.println();
        for(int a = floors - 1; a > 0; a--){
            for(int b = 0;b < rooms; b++){
                if(a % 2 == 0){
                    System.out.printf("O%d%d ", a, b);
                }
                else{
                    System.out.printf("A%d%d ", a, b);
                }
            }
            System.out.println();
        }
    }
}