package com.company;
    class Base1{
        public Base1(){
            System.out.println("i m a base class constructor ");
        }
        public Base1(int x){
            System.out.println("im an overloaded constructor with value of a as:"+ x );
        }
    }
    class Derived1 extends Base1 {
        Derived1() {
            //super(0);
            System.out.println(" im in derived class ");
        }

        Derived1(int x, int y) {
            super(x);
            System.out.println("im an overloaded constructor derived with value of b as:" + y);
        }
    }
        class ChildOfDerived extends Derived1 {
            ChildOfDerived() {
                System.out.println(" im child of derived1 ");
            }

            ChildOfDerived(int x, int y, int z) {
                super(x, y);
                System.out.println(" i am overloaded constructor of derived 1 as value of z:" + z);
            }
        }

public class cwh_46 {
    public static void main(String[] args) {
       // Base1 b=new Base1();
      //  Derived1 d =new Derived1();
//Derived1 d=new Derived1(45,9);
ChildOfDerived cd =new ChildOfDerived(4,8,5);
    }
}
