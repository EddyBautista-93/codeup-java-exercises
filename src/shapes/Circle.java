package shapes;

public class Circle {
    private double radius;

    public Circle(double r){
        this.radius = r;
    }

public double getArea(){
       return (this.radius * Math.PI) * radius;
}

    public static void main(String[] args) {
        Circle x = new Circle(6);
        System.out.println(x.getArea());
    }
}

