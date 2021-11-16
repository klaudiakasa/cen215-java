
public class TestTriangle2D {
    public static void main(String[] args) {

        MyPoint p1 = new MyPoint(-3, -1);
        MyPoint p2 = new MyPoint(2, -1);
        MyPoint p3 = new MyPoint(2, 3);
        MyPoint p4 = new MyPoint(0, 0);
        Triangle2D triangle2D = new Triangle2D(p1, p2, p3);
        // 2 3
        // 0 0
        System.out.printf("Perimeter=%.2f\n", triangle2D.getPerimeter());
        System.out.printf("Area=%.2f\n", triangle2D.getArea());
        Triangle2D triangle2 = new Triangle2D(new MyPoint(0, 0),
                new MyPoint(0, 4), new MyPoint(4, 0));
        System.out.printf("Perimeter=%.2f\n", triangle2.getPerimeter());
        System.out.printf("Area=%.2f\n", triangle2.getArea());
        System.out.println(triangle2D.contains(p4));
    }
}
