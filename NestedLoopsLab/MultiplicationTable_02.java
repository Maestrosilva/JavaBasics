package JavaBasics.NestedLoopsLab;

public class MultiplicationTable_02 {
    public static void main(String[] args) {
        for(int a = 1; a <= 10; a++){
            for (int b = 1; b <= 10; b++){
                int c = a * b;
                System.out.println(a + " * " + b + " = " + c);
            }
        }
    }
}