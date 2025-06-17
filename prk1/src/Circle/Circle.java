package Circle;

public class Circle {
    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    public void changeColor(String newColor) {
        this.color = newColor;
    }

    public void displayInfo() {
        System.out.println("Круг: радиус = " + radius + ", цвет = " + color);
    }

    public boolean isBig() {
        return radius > 10;
    }

    public void increaseRadius(double value) {
        radius += value;
    }

    public void decreaseRadius(double value) {
        radius = Math.max(0, radius - value);
    }
}

