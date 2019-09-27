package shapes;

public class Square extends Rectangle{


    public Square(int side) {
        super(side, side);

    }
    @Override
    public int getArea() {
        return 4 * super.length;
    }

    @Override
    public int getPerimeter() {
        return 4 * super.width * super.width;
    }
}

