//CALLING METHOD USING STATIC
import java.util.Scanner;

public class cwh_31_methods {
   static  int logic(int x, int y) {
        int z;
        if (x > y) {
            z = x + y;
        } else {
            z = (x + y) * 5;
        }
        return z;
    }


public static void main(String[] args) {
       // creating an object for calling method
      // cwh_31_methods obj=new cwh_31_methods();
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c;c = logic(a, b);

    //c = obj.logic(a, b);
    int a1 = 5;
    int a2 = 9;
    int c1;
    c1 = logic(a1, a2);
    //c1 = obj.logic(a1, a2);
    System.out.println(c);
    System.out.println(c1);
}
}