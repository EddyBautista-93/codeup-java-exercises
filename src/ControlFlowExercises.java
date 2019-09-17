import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int i = 0;
        do {
            System.out.println("i = " + i);
            i += 2;
        } while (i <= 100);

    }
}
