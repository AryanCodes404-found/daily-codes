import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
//        int[] num = {1, 6, 4, 15, 4};
        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//
//        for (int element : num) {
//            if (x == element) {
//                System.out.println("found");
//            }
//        }
//    }
//}
        //alternate method


        // Input size of the array
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int[] num = new int[size];

        // Input elements into the array
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            num[i] = sc.nextInt();
        }

        // Input the number to search
        System.out.println("Enter the number to find:");
        int x = sc.nextInt();

        // Search for the number in the array
        boolean found = false;
        for (int i = 0; i < num.length; i++) {
            if (x == num[i]) {
                System.out.println("Number found at index: " + i);
                found = true;
                break;
                // Exit loop after finding the number
            }
        }
        if (!found){
                System.out.println("Number not found in the array.");
            }
        }
    }

