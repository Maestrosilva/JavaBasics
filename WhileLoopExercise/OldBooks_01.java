package JavaBasics.WhileLoopExercise;

import java.util.Scanner;

public class OldBooks_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String goal = scanner.nextLine();
        int books = 0;
        while (true){
            String book = scanner.nextLine();
            if (book.equals(goal)){
                System.out.printf("You checked %d books and found it.", books);
                break;
            }
            if(book.equals("No More Books")){
                System.out.println("The book you search is not here!");
                System.out.printf("You checked %d books.", books);
                break;
            }
            books ++;
        }
    }
}