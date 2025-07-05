package com.company;
 abstract class  Parent2 {
     Parent2() {
         System.out.println(" i am const");
     }

     public void sayHello() {
         System.out.println("hello");

     }
         abstract public void greet();
         abstract public void greet1();
 }
 class Child2 extends Parent2 {
     @Override
     public void greet() {
         System.out.println("GM");
     }

     @Override
     public void greet1() {
         System.out.println("GN");
     }
 }
// }class Child3 extends Parent2{
//     public void th(){  // error throws
//         System.out.println(" i am good");
//     }
public class cwh_51_abstractClasses {
    public static void main(String[] args) {

        Parent2 obj=new Child2();
        //Child2 c=new Child2();

        obj.greet();
        obj.greet1();
        obj.sayHello();
        //parent2 child3 ka obj nhi banega
    }
}

