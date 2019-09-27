package shapes;

public class Square extends Quadrilateral{
    public Square(double length, double width) {
        super(length, width);
    }

    @Override
    public double setLength() {
        return this.length;
    }

    @Override
    public double setWidth() {
        return this.width;
    }

    @Override
    public double getPerimeter() {
        return 4 * this.length;
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }
}

