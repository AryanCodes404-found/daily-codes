class circle {
    private int radius;
    private int area;
    private int perimeter;
    int pi=3;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int r) {
        this.radius = r;
    }

    public void checkperimeter(float p){
        perimeter = 2*3*radius;
        if(perimeter==p)
        {
            System.out.println("Correct Perimeter.");
        }
        else{
            System.out.println("Incorrect Perimeter.");
        }
    }
    public void checkarea(int a){
        area=3*radius*radius;
        if(area==a)
        {
            System.out.println("Correct Area.");
        }
        else{
            System.out.println("Incorrect Area.");
        }
    }
}
public class cwh_ch9 {
    public static void main(String[] args) {
        circle sol=new circle();
        sol.setRadius(5);
sol.checkarea(75);
sol.checkperimeter(30);
    }
}
