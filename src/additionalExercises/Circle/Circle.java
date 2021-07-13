package additionalExercises.Circle;

public class Circle {
    private double radius;

    public Circle (double radius){
        this.radius = radius;
    }

    public Circle(){
    }

    public double getRadius(){
        return radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

}
