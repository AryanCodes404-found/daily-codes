package com.company;
class MyThreadRun1 implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while (i < 20000) {
            System.out.println(" i am Thread1 ");
            i++;
        }
    }
}
    class MyThreadRun2 implements Runnable{
        @Override
        public void run() {
            int i=0;
            while(i<20000){
                System.out.println(" i am Thread2 ");
                i++;
            }
        }}


public class cwh_71_RunInterface {
    public static void main(String[] args) {
        MyThreadRun1 bullet1=new MyThreadRun1();
        Thread gun1=new Thread(bullet1);
        MyThreadRun2 bullet2=new MyThreadRun2();
        Thread gun2=new Thread(bullet2);
        gun1.start();
        gun2.start();
    }
}

