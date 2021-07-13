package additionalExercises.Rectangle;

public class Rectangle {
    private int length;
    private int breadth;

    void setData(int a, int b){
        length = a;
        breadth = b;
    }

    public int getArea(){
        return length * breadth;
    }
    public int getPerimeter(){
        return 2 * (length + breadth);
    }
}
