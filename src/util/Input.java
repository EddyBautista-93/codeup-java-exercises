package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input(){
        this.scanner = new Scanner(System.in);
    }

public String getString(){
//    System.out.println("Enter a Sentence");
    return this.scanner.nextLine();
}

public Boolean yesNO(){
    System.out.println("[Y/N}");
    if(getString().equalsIgnoreCase("y")){
        return true;
    } else{
        return false;
    }
}

public int getInt(int min, int max){
    int number = getInt();
    if(number >= min && number <= max){
        return number;
    } else{
        System.out.println("out of range");
        return getInt(min, max);
    }
}

public int getInt(){
    System.out.println("Give me a number");
        return Integer.parseInt(this.scanner.nextLine());
}

public double getDouble(double min, double max){
    double number = getDouble();
    if(number >= min && number <= max){
        return number;
    } else{
        System.out.println("out of range");
        return getDouble(min, max);
    }
}
public double getDouble(){
    System.out.println("GIve me a Decimal : ");
        return Double.parseDouble(this.scanner.nextLine());
}



    public static void main(String[] args) {
        Input userInput = new Input();
//        System.out.println(userInput.getString());
//        System.out.println(userInput.yesNO());

    }
}

