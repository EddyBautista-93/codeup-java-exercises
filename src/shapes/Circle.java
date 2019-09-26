package shapes;

import util.Input;

public class Circle {
    private double radius;

    public Circle(double r){
        this.radius = r;
    }

public double getArea(){
    return  Math.PI * (Math.pow(this.radius, 2));
}
    public double getCircumference(){
        return Math.PI * 2 * this.radius;
    }

}

