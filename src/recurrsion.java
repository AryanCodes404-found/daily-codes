public class recurrsion {
//    static int factorial(int n) {
//if (n==0 || n==1){
//    return 1;
//    }
//else {
//    return n * factorial(n-1);
//}
//
//}
//
//    public static void main(String[] args) {
//        int n=5;
//        System.out.println("the factorial "+ factorial(n));
//    }
//
//}
static int factorial(int n) {
    int mul=1;

    for(int i=n;i>0;i--){

        mul*=i;
    }
    return mul;


}

    public static void main(String[] args) {
        int n=5;
        System.out.println(factorial(n));
    }

}
