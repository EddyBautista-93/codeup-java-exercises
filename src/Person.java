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
        eddy.sayHello();
        eddy.setName("eddy");
    }
}
