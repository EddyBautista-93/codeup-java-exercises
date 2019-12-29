import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysExercises {
    static Person[] person = new Person[3];

    public static void main(String[] args) {

//      Util to get back a string version of a object
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        person[0] = new Person("Bobby");
        person[1] = new Person("Hobby");
        person[2] = new Person("Give me a Jobby");
        for (Person x : person) {
            System.out.println(x.getName());
        }
    }
}


