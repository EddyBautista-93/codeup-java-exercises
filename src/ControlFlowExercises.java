import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
//        do {
//            System.out.println("i = " + i);
//            i -=
//        } while (i >= 0);
//            int i = 2;
//        do {
//            System.out.println(i);
//            i *= Math.pow(i, 1);
//
//
//        }while(i <= 1000000);
//        for(byte i = 100; i >= 0;i -=5 ){
//            System.out.println("i = " + i);
//        }
//        for(int i = 2; i <= 1000000; i *=Math.pow(i, 1)){
//            System.out.println("i = " + i);
//        }
        for(int i = 1; i <=100; i++){
            if(i % 15 == 0){
                System.out.println("FizzBuzz");
            } else if(i % 3 == 0){
                System.out.println("Fizz");
            } else if(i % 5 == 0){
                System.out.println("Buzz");
            } else {
                System.out.println("i = " + i);
            }
        }
    }
}
