

//public class ps7 {
//prob 1
//    static void mul() {
//        int n=5;
//        for (int i = 1; i <= 10; i++) {
//            System.out.printf("%d X %d= %d", n, i, n * i);
//            System.out.println();
//
//        }
//
//    }
//
//    public static void main(String[] args) {
//
//        System.out.println("the multiplication table of 5 is");
//        mul();
//    }
//}
//
//}
//    static void pattern(int n){
//        for(int i=1;i<=4;i++) {
//            for (int j = 1; j<=i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//
//    public static void main(String[] args) {
//        pattern();
//    }
//}
//using itrerative method
//    public static void main(String[] args) {
//        int n = 5;
//
//        int factorial=1;
//        for (int i = 5; i >= 1; i--) {
//
//
//           factorial*=i;
//        }
//        System.out.println("the fact of number is  "+factorial);
//
//    }

//using recursion

    //    static int factorial(int n) {
//        if (n == 0 || n == 1) {
//            return 1;
//        } else {
//            return n * factorial(n - 1);
//        }
//    }
//
//    public static void main(String[] args) {
//        int n = 4; // Corrected variable declaration
//        System.out.print("The factorial of " + n + " is " + factorial(n));
//    }
//problem 3
//public static int sumRec(int n){
//    if( n==1){
//        return 1;
//
//    }else{
//        return n+sumRec(n-1);
//    }
//}
//
//    public static void main(String[] args) {
//    int c =sumRec(7);
//        System.out.println(c);
//    }
//}
//PROBLEM 4
   /* public static void pattern2() {   int n = 3;
        for (int i = 0; i <=n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("*");


            }
            System.out.println();

        }

    }

    public static void main(String[] args) {

        pattern2();
    }*/

    //    public static int fib(int n) {
//
//        if (n == 1 || n == 0) {
//            return (n-1);
//        }
//        else {
//            return fib(n - 2) + fib(n - 1);
//        }
//    }
//
//
//    public static void main(String[] args) {
//
//        int c = fib(9);
//        System.out.println(c);
//    }
//}
//PROBLEM 6
//    public static float var(int... arr) {
//       float sum= 0;
//        float average =0;
//        for (int e : arr) {
//            sum += e;
//            average= (sum)/arr.length;
//
//        }
//
//        return average;
//    }
//
//    public static void main(String[] args) {
//
//       System.out.println("the avg of the arrays is " + (var(4,5,6,9));
//    }
//}
//PROBLEM 7
   // public class Revise {
//        public static void patternRec(int n) {
//            if (n == 0) {
//                return;
//            }
//
//            // Print n stars
//            for (int j =1; j< n; j++) {
//                System.out.print("*");
//            }
//            System.out.println();

            // Recursive call for n - 1
            //patternRec(n - 1);
        //}

      //  public static void main(String[] args) {
            //int n = 4;
            //patternRec(n);
        //}

   // }
    //}
static float tempRec(float n){
    return (n*(1.8f)+32);
}
public static void main(String[] args) {
    float res = tempRec(7);
    System.out.println(res);
}













