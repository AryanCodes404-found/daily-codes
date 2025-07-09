package com.company;
class MyThread11 extends Thread{
    public MyThread11(String name){
        super(name);
        System.out.println("hello");
    }

    @Override
    public void run() {
       //super.run();
        System.out.println(" i am a thread");
    }
}
public class cwh_73_ThreadConst {
    public static void main(String[] args) {
        MyThread11 th=new MyThread11("aryan");
        MyThread11 thh=new MyThread11("shivam");
        th.start();
        System.out.println("the name of thread is "+ th.getName());
        System.out.println("the id of thread is "+ th.threadId());
        System.out.println("the name is "+thh.getName());
    }


}
