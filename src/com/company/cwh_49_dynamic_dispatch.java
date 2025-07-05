package com.company;
class Phone {
    public void ShowTime(){
        System.out.println("its 8 am");
    }
    public void on(){
        System.out.println("phone is turning on ");
    }
}class SmartPhone extends Phone{
    @Override
    public void on (){
        System.out.println("smart phone is turning on");
    }
    public void Music(){
        System.out.println("turning on music");
    }
}

public class cwh_49_dynamic_dispatch {
    public static void main(String[] args) {
        Phone obj=new SmartPhone();
        obj.on();
        obj.ShowTime();
       // obj.Music();// not allowed
    } 
}
