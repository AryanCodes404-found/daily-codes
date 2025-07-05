import java.util.Scanner;

public class arrays1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size=sc.nextInt();
        int number[]=new int[size];
      //input
        for(int i=0;i<size;i++){
           number[i]=sc.nextInt();
       }
//output
        for (int i = 0; i < size; i++) {
            System.out.println(number[i]);//default value is 0 in java
        }
    }
    }

//System.out.println("enter the size of the array");
//        int size = sc.nextInt();
//        System.out.println("enter marks");
//        int marks[] = new int[size];
//        for (int i = 0; i < size; i++) {
//            marks[i] = sc.nextInt();
//        }
//        System.out.println("enter x ");
//        int x = sc.nextInt();
//        for (int i = 0; i < marks.length; i++) {
//            if (marks[i] == x) {
//                System.out.println(" number found at index "+i );
//            }
//            else{
//                System.out.println("not found ");
//            }
//        }
//    }  }
