package com.company;

interface Camera1 {
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

interface wifi1 {
    String[] getNetworks();
    void ConnectToNetwork();
}

class MyCellPhone1{
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
class MySmartPhone extends MyCellPhone implements Camera, wifi {

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

public class cwh_57_default_Ex {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
        String[] arr = ms.getNetworks();
        for (String item : arr) {
            System.out.println(item);
        }
        ms.ConnectToNetwork();
        ms.ConnectToNetwork("aryan's 5g");
        ms.callNumber(992053686);
        ms.pickCall();
        ms.record4KVideos();
        // ms.greet(); // Not accessible
    }
}
