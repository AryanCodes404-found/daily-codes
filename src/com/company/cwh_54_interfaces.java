package com.company;
interface Bicycle{
    int a=45;
    void applyBreak(int decrement);
    void speedUp(int increment);
}
interface  horn{
    void applyHorn();
    void applyHorn1();
}
class AvonCycle implements Bicycle,horn{
    public void blowHorn(){
        System.out.println(" pee pee poo poo");
    }

    @Override
    public void applyBreak(int decrement) {
        System.out.println("applying break");
    }

    @Override
    public void speedUp(int increment) {
        System.out.println(" applying speedUp");
    }
    public void applyHorn(){
        System.out.println("yara na ");
    }
    public void applyHorn1(){
        System.out.println("desh mera pee pee ");
    }
}
public class cwh_54_interfaces {
    public static void main(String[] args) {
        AvonCycle c=new AvonCycle();
        c.applyHorn();
         c.speedUp(23);
        System.out.println(Bicycle.a);
    }
}
