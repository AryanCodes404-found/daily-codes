package com.company;

import javax.print.Doc;

class EkClass {
    int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    EkClass(int v) {
        a = v;
    }
}
  class DoClass extends EkClass{
    DoClass(int c ){
        super(c);// if this not written then error will come
        System.out.println("i am a constructor ");
    }
  }


public class cwh_47_this_super  {
    public static void main(String[] args) {
        EkClass e=new EkClass(8);
DoClass d=new DoClass(5);
        System.out.println(d.getA());
//        e.setA(45);
  //System.out.println(e.getA());
    }
}
//super keyword
