package assignments;

public class Circle {
    private int radius;
    private double perimeter;
    private double area;

    public Circle(int radius){
        this.radius=radius;
    }

    public int getRadius(){
        return radius;
    }

    public void calculatePerimeter(){
        //perimeter = 2 * pi(22/7) * radius
        double calculatedPerimeter = (2 * Math.PI) * getRadius();
        String perimeterAsString = String.format("%.2f", calculatedPerimeter);
        perimeter = Double.parseDouble(perimeterAsString);
    }

    public double getPerimeter(){
        return perimeter;
    }

    public void calculateArea() {
        double calculatedArea = (Math.PI) * getRadius() * getRadius();
        String areaAsString = String.format("%.2f", calculatedArea);
        area = Double.parseDouble(areaAsString);
    }

    public double getArea() {
        return area;
    }
}
