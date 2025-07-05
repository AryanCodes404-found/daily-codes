package com.company;
interface sample{
    void meth1();
    void meth2();
}
interface SampleChild extends sample{
    void meth3();
    void meth4();
}
class Sample1 implements SampleChild{
    public void meth3() {
        System.out.println("meth3");
    }
    public void meth4() {
        System.out.println("meth4");
    }
    public void meth1() {
        System.out.println("meth1");
    }
    public void meth2() {
        System.out.println("meth2");
    }
}
public class cwh_58_inheritance {
    public static void main(String[] args) {
Sample1 s=new Sample1();
s.meth1();
s.meth2();
    }
}
