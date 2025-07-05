public class cwh_33_var_args {
    static int sum(int x,int... arr) {
        int sum = x;
        for (int a : arr) {
            sum += a;


        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("the sum of the arrays: " + sum(4 ,4,8,9));

    }
}




