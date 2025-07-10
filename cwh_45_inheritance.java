package com.company;
class Base {
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("im in base setting x now ");
        this.x = x;
    }

}
class Derived extends Base {
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class cwh_45_inheritance {
    public static void main(String[] args) {
        Base b =new Base();
        b.setX(4);
        System.out.println(b.getX());
        Derived d=new Derived();
        d.setX(6);
        System.out.println(d.getX());

    }
}
