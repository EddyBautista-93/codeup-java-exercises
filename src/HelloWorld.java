import jdk.swing.interop.SwingInterOpUtils;

import java.text.DecimalFormat;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args){
//        System.out.println("Hello, World");
//        1.
//        int myFavoriteNumber = 25;
//        2.
//        String myString = "Hello from ceres";
//        System.out.println(myString);
//        3.
//        myString = "x";
//        System.out.println(myString);
//        4.(gives error because you cant change a string varaible to a number)
//        myString = 12
//        5.(gives a error if you initilze a variable with no value
//        long myNumber;
//        System.out.println(myNumber);
//        6.(requires long or double)
//        myNumber = 3.14;
//        7.
//        myNumber = 123L;
//        8.
//        myNumber = 123;
        //only double or float complile numbers with decimel values
//      9.
//        float myNumber = 3.14;
//        you cant change the type of value once you made it.
//        10.
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);
//        when the unary Operators go after it prints the variable then it does the addition

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);
//        this way prints the varaible with the incrmebt since it is called first.

//        11. it doesnt see class as a indentifier
//        int class = 3;

//        12.
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
//        int three = (int) "three";®

//
//        13.
//            int x = 4;
//            x += 5;
//        System.out.println(x);
//        int x = 3;
//        int y = 4;
//            y *= x;
//        System.out.println(y);
//        int x = 10;
//        int y = 2;
//         x /= y;
//        y -= x;
//        System.out.println(y);


//
//        you get a random number that overflows
//        double pi = 3.14159;
//        System.out.format("The Value of pi is approximately %.2f ", pi);
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a number");
//        int userInput = scanner.nextInt();
//        System.out.println(userInput);
//        System.out.println("Enter three words");
//        String userWordOne = scanner.nextLine();
//        String userWordTwo = scanner.nextLine();
//        String userWordThree = scanner.nextLine();
//        System.out.println(userWordOne);
//        System.out.println(userWordTwo);
//        System.out.println(userWordThree);
//        System.out.println("Enter a sentence");
//        String sent = scanner.nextLine();
//        System.out.println(sent);
        System.out.println("Enter the length and the width of the classroom");
        String widthString = scanner.nextLine();
         String lengthString = scanner.nextLine();

         int width = Integer.parseInt(widthString);
         int length = Integer.parseInt(lengthString);

        System.out.println(width * length);



    }
}
