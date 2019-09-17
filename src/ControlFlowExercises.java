import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
//        do {
//            System.out.println("i = " + i);
//            i -=
//        } while (i >= 0);
            int i = 2;
        do {
            System.out.println(i);
            i *= Math.pow(i, 1);


        }while(i <= 1000000);
    }
}
