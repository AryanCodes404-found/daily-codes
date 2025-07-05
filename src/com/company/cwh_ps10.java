package com.company;
//class Circle {
//    float radius;
//    Circle(){
//        System.out.println(" i am non param of circle");
//    }
//Circle(int n){
//    System.out.println(" iam circle param constuctor");
//    radius=n;
//}
//    public float area() {
//        float r = radius;
//        return (float) (Math.PI * r * r);
//    }
//    }
//
//    class Cylinder1 extends Circle {
//        float height;
//
//        Cylinder1(float r,float h) {
//            System.out.println("i am cylinder param const");
//            //super((int) r);
//            height=h;
//        }
//
//        public float Volume() {
//            return (float) (Math.PI * radius * radius*height);
//        }
//    }
//
//public class cwh_ps10 {
//    public static void main(String[] args) {
//        //Circle c=new Circle(2);
//       // c.area();
//        Cylinder1 cy=new Cylinder1(2,4);
//        cy.height=4;cy.radius=2;
//        System.out.println(cy.Volume());
//     //System.out.println(cy.area());
//
//    }
//}


//problem 2
class Rectangle1 {
    int length, breadth;
    public float area() {
        return length * breadth;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    Rectangle1() {
        System.out.println(" i am rectangle");
    }
}

    class Cubiod extends Rectangle1 {

        float height;

        public void setHeight(float height) {
            this.height = height;
        }

        public float getHeight() {
            return height;
        }

        public float volume() {
            return length * breadth * height;
        }
    }


class cwh_ps10{
    public static void main(String[] args) {
//Rectangle1 r=new Rectangle1();
Cubiod c=new Cubiod();
c.setHeight(2.5f);
c.setLength(2);
c.setBreadth(6);
        System.out.println(c.volume());
        System.out.println(c.area());}
}