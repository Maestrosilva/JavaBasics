package JavaBasics.NestedLoopsLab;

public class Clock_01 {
    public static void main(String[] args) {
        for (int a = 0; a < 24; a++) {
            for (int b = 0; b < 60; b++){
                System.out.println(a + ":" + b);
            }
        }
    }
}