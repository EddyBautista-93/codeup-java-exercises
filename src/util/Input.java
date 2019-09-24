package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input(){
        this.scanner = new Scanner(System.in);
    }

String getString(){
    System.out.println("Enter a Sentence");
    return this.scanner.nextLine();
}

Boolean yesNO(){
    System.out.println("[Y/N}");
    if(this.scanner.nextLine().equalsIgnoreCase("y")){
        return true;
    } else{
        return false;
    }
}

int getInt(int min, double max){
        min = this.scanner.nextInt();
                max = this.scanner.nextInt();
                return min;
}

int getInt(){
        return this.scanner.nextInt();
}

double getDouble(double min, double max){
         min = this.scanner.nextDouble();
         max = this.scanner.nextDouble();
         return max;
}
double getDouble(){
        return this.scanner.nextDouble();
}



    public static void main(String[] args) {
        Input userInput = new Input();
//        System.out.println(userInput.getString());
//        System.out.println(userInput.yesNO());

    }
}

