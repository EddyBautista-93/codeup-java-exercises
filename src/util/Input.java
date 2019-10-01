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

    public String getString(String prompt){
        if (prompt.isEmpty()){
            System.out.println("Enter something:");
        }else {
            System.out.println(prompt);
        }

        return getString(); //returns the scanner.nextLine()
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

//public int getInt(){
//    System.out.println("Give me a number");
//        return Integer.parseInt(this.scanner.nextLine());
//}

    public int getInt() {
        int number;
        try {
            number = Integer.valueOf(getString("Enter a number"));
        }catch(Exception e){
            System.out.println("invalid input! ");
            e.printStackTrace();
            return getInt();
        }
        return number;
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
    double number;
    try {
        number = Integer.valueOf(getString("Enter a number"));
    }catch(Exception e){
        System.out.println("invalid input! ");
        e.printStackTrace();
        return getInt();
    }
    return number;
}



    public static void main(String[] args) {
        Input userInput = new Input();
//        System.out.println(userInput.getString());
//        System.out.println(userInput.yesNO());

    }
}

