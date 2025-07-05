public class cwh_32_overloading {

    static void foo() {
        System.out.println("Good Morning bro!");
    }

    static void foo(int a) {
        System.out.println("Good morning " + a + " bro!");
    }

    static void foo(int a, int b) {
        System.out.println("Good morning " + a + " bro!");
        System.out.println("Good morning " + b + " bro!");
    }

    static void foo(int a, int b, int c) {
        System.out.println("Good morning " + a + " bro!");
        System.out.println("Good morning " + b + " bro!");

    }

    public static void main(String[] args) {
        foo(); // Calls foo() with no parameters
        foo(3000); // Calls foo(int a)
        foo(7000, 4000); // Calls foo(int a, int b)
    }
}


