public class MethodsExercises {
    public static void main(String[] args) {
        System.out.println(addition(5, 3));
        System.out.println(subtraction(10, 5));
        System.out.println(multply(5, 4));
        System.out.println(div(10, 2));
        System.out.println(modulus(2,3));
        System.out.println(multiplyNoOp(10,10));
    }

//    1. Basic Arithmetic
    public static int addition(int sum1, int sum2){
        return sum1 + sum2;
    }
    public static int subtraction(int sum3, int sum4){
        return sum3 - sum4;
    }
    public static int multply(int sum5, int sum6){
        return sum5 * sum6;
    }
    public static int div(int sum7, int sum8){
        return sum7 / sum8;
    }
    public static int modulus(int sum9, int sum10){
        return sum9 % sum10;
    }
    public static int multiplyNoOp(int x, int y){
        if(y == 0){
            return 0;
        }
        return (x + multiplyNoOp(x, y - 1));
    }
}
