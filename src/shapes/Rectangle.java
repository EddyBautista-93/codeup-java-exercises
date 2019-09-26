package shapes;

public class Rectangle {

    protected int length;
    protected int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getPerimeter(){
        int perimeter = (2 * this.length) + (2 * this.width);
        return perimeter;
    }

    public int getArea(){
        int area = this.length * this.width;
        return area;

    }
// tesing purposes only
//    public static void main(String[] args) {
//        Rectangle bob = new Rectangle(2,4);
//        System.out.println(bob.getArea());
//        System.out.println(bob.getPerimeter());
//    }
}
