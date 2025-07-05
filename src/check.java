class circle {
    private int radius;
    private int perimeter;
    int pi=3;

    public int getRadius() {
        return radius;
    }public void setRadius(int r) {
        this.radius = r;
    }

    public int getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(int a) {
        perimeter = 2 * pi * radius;
        if (perimeter == a) {
            System.out.println("correct");
        } else {
            System.out.println("incorrect");
        }

    }

        public static void main(String[] args) {
            circle boy=new circle();
            boy.setRadius(5);
            boy.setPerimeter(70);
            System.out.println(boy.getPerimeter());
        }
}
