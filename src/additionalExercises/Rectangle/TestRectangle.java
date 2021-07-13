package additionalExercises.Rectangle;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        rectangle.setData(4,15);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
    }
}
