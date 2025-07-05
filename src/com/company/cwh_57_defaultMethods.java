package com.company;
interface Camera{
    void takeSnap();
    void recordVideos();
public default void greet(){
        System.out.println("GM");
    }
    default void record4KVideos(){
        System.out.println("recording in 4k");
    }
}
interface wifi{
    String[] getNetworks();
    void ConnectToNetwork();
}
 abstract class MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("calling"+phoneNumber);
    }
     void pickCall(){
         System.out.println("connecting");
     }

    public abstract void ConnectToNetwork(String network);

    static class MySmartPhone extends MyCellPhone implements Camera,wifi{

         @Override
         public void takeSnap() {
             System.out.println("taking snap");
         }

        @Override
        public void record4KVideos() {
            System.out.println("hi");
           Camera.super.record4KVideos();
        }

        @Override
         public void recordVideos() {
             System.out.println("recording ");
         }

         @Override
         public String[] getNetworks() {
             System.out.println("getting number of list ");
             String[] networkList={"iqoo","apple","aryan's 5g"};
             return networkList;
         }

        @Override
        public void ConnectToNetwork() {
            System.out.println("connecting to network");
        }

        @Override
         public void ConnectToNetwork(String network) {
             System.out.println("connecting to network"+ network);
         }
     }
}
public class cwh_57_defaultMethods {
    public static void main(String[] args) {
        MyCellPhone.MySmartPhone ms=new MyCellPhone.MySmartPhone();
        String[] arr= ms.getNetworks();
        for(String item:arr ){
            System.out.println(item);
        }
        ms.ConnectToNetwork();
        ms.ConnectToNetwork("  aryan's 5g");
        ms.callNumber(992053686);
        ms.pickCall();
        ms.record4KVideos();
       ms.greet();
    }
}
