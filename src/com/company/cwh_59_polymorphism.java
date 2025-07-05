package com.company;
interface Camera2 {
    void takeSnap();
    void recordVideos();

    private void greet() {
        System.out.println("GM");
    }

    default void record4KVideos() {
        greet();
        System.out.println("recording in 4k");
    }
}

interface wifi2 {
    String[] getNetworks();
    void ConnectToNetwork();
}

class MyCellPhone2{
    void callNumber(int phoneNumber) {
        System.out.println("calling " + phoneNumber);
    }

    void pickCall() {
        System.out.println("connecting");
    }

    public void ConnectToNetwork(String network) {
        System.out.println("connecting to network " + network);
    }
}

// ❗ Moved MySmartPhone out of MyCellPhone
class MySmartPhone1 extends MyCellPhone2 implements Camera2, wifi2 {

    @Override
    public void takeSnap() {
        System.out.println("taking snap");
    }

    @Override
    public void recordVideos() {
        System.out.println("recording");
    }

    @Override
    public String[] getNetworks() {
        System.out.println("getting number of list");
        String[] networkList = {"iqoo", "apple", "aryan's 5g"};
        return networkList;
    }

    @Override
    public void ConnectToNetwork() {
        System.out.println("connecting to network");
    }

    // This overrides MyCellPhone's ConnectToNetwork(String)
    @Override
    public void ConnectToNetwork(String network) {
        System.out.println("connecting to network " + network);
    }
}
public class cwh_59_polymorphism{
    public static void main(String[] args) {
        Camera2 cam=new MySmartPhone1();
        cam.record4KVideos();
       // cam.getNetworks(); throws that error
        //cam 1 ka ref use kiya hai
    }
}
