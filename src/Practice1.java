class Circle1 {
    float pi = 3f;
    private float radius;
    private float perimeter;
    private float area;

    public float getRadius() {
        return radius;
    }

    public void setRadius(float n) {
        this.radius = n;
    }

    public void checkPerimeter(float p) {
        perimeter = 2 * pi * radius;
        if (perimeter == p) {
            System.out.println("correct");
        } else {
            System.out.println("incorrect");
        }
    }

    public void checkArea(float a) {
        area = pi * radius * radius;
        if (area == a) {
            System.out.println("correct");
        } else {
            System.out.println("incorrect");
        }
    }
}

public class Practice1 {
    public static void main(String[] args) {
        Circle1 per = new Circle1();
        per.setRadius(5); // Use setter to set private variable
        per.checkArea(75);
        per.checkPerimeter(30);
    }
}
