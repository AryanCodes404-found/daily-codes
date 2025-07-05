package com.company;
class Animal {
    public Animal() {
        System.out.println(" this is animal class");
    }

    public void location() {
        System.out.println("we live in jungle");
    }
}
    class Dog extends Animal {
        public Dog() {
            System.out.println("bhow bhwo");
        }
        public void speak() {
            System.out.println("my name is oreo");
        }
    }
        public class hw_cwh_45 {
            public static void main(String[] args) {
                Dog obj = new Dog();
                obj.location();
                obj.speak();
            }
        }

