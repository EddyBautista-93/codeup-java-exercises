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
//        for(int i = 1; i <=100; i++){
//            if(i % 15 == 0){
//                System.out.println("FizzBuzz");
//            } else if(i % 3 == 0){
//                System.out.println("Fizz");
//            } else if(i % 5 == 0){
//                System.out.println("Buzz");
//            } else {
//                System.out.println("i = " + i);
//            }
//        }
//
//        String yesNO = "y";
//
//        while(yesNO.equalsIgnoreCase("y")){
//        int i = input.nextInt();
//        System.out.println("Enter a Intger");
//        int startValue = 1;
//        int inc = input.nextInt();
////        System.out.println("number | squared | cubed");
////        System.out.println("------ | ------- | -----");
//        for (int row =0; row < inc; row++) {
//            int y = 1;
//
//            for (int col = startValue; col < startValue + 3; col++) {
//
//                y = y * startValue;
//                System.out.print(y + " ");
//
//            }
//
//
//            System.out.println();
//            startValue++;
//            }
//
//            System.out.println("Would you like to test another number Y/N");
//
//
//
//        yesNO = input.nextLine();
//
//        }

//        String yesNO = "y";
//
//        while(yesNO.equalsIgnoreCase("y")){
//            System.out.println("Enter a number");
//            int answer = Integer.parseInt(input.nextLine());
//            System.out.println("Heres your table");
//
//            for(int counter = 1; counter <= answer; counter++){
//                System.out.println(String.format("%-6d | %-7d | %-6d", counter, (int)Math.pow(counter, 2), (int)Math.pow(counter, 3)));
//            }
//            System.out.println("Would you like to test another number y/n");
//            yesNO = input.nextLine();
//
//        }

            int grade = Integer.parseInt(input.nextLine());
        System.out.println("Enter yout grade");
            if(grade <= 100 && grade >= 88){
                System.out.println("A");
        } else if(grade <= 87 && grade >= 80){
                System.out.println("B");
            }else if(grade <= 79 && grade >= 70){
                System.out.println("C");
            }


    }
}
