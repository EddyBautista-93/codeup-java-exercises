public class Person {
    private String name;

    // returns the person's name
    public String getName(){
       return this.name;
    }
    // changes the name property to the passed value
    public void setName(String name){
        this.name = name;
    }

    // prints a message to the console using the person's name
    public void sayHello(){
        System.out.printf("Hello my name is %s",name);
    }
    public Person(String wN){
        this.name = wN;
    }

    public static void main(String[] args) {
        Person eddy = new Person("eddy");

//        eddy.sayHello();
//        eddy.setName("eddy");


//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
////        / will be true due to name value
//        System.out.println(person1.getName().equals(person2.getName()));
////        Will be false due to two diffrent instances
//        System.out.println(person1 == person2);


//        Equals as true because they are the same instance
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);


//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());


    }
}
