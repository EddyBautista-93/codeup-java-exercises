import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysExercises {
    static Person[] people = new Person[3];


public static Person[] addPerson(Person[] people, Person newPerson) {
    Person[] newList = Arrays.copyOf(people, people.length + 1);
    newList[newList.length -1] = newPerson;
    for (Person person : newList){
        System.out.println(person.getName());
    }
        return newList;
}


    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));
        people[0] = new Person("Alex");
        people[1] = new Person("Bev");
        people[2] = new Person("Dani");

//        for(Person x: people){
//            System.out.println(x.getName());
//        }

        addPerson(people, new Person("eddy"));

      }

    }


