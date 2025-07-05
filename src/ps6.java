import java.util.Scanner;

public class ps6 {
    public static void main(String[] args) {
//        //Q1
//        float[] num = {1.2f, 1.7f, 7.8f, 3.4f, 1.1f};
//        float sum = 0;
//        float a = 0;
//        for (float element : num) {
//            sum = sum + element;
//            a = (sum / 5);
//        }
//        System.out.println("the value of sum is " + a);
//    }
//}
        //Q2
//        int number = 12;
//        boolean isArray=false;
//        int[] num = {12, 45, 24, 10};
//        for (int element : num) {
//            if (number == element) {
//                isArray = true;
//                break;
//            }
//
//        }
//        if(isArray){
//            System.out.println("yes");
//        }
//        else{
//            System.out.println("no");
//        }
//        }
//    }

//problem 5
   /* int arr []={1,2,3,4,5,6};
    int l=arr.length;
    int temp;
    int n=Math.floorDiv(l,2);
    for(int i=0;i<=n;i++){
        temp=arr[i];
        arr[i]=arr[l-i-1];
        arr[l-i-1]=temp;

    }
    for(int element: arr){
        System.out.print(STR."\{element} ");
    }
  }}*/

   int []arr ={-256,1,2,3,4,5,6};
        int min =Integer.MAX_VALUE;
   for (int e:arr ){
if(e<min){
    min=e;
}

   }
        System.out.println("the min value is "+min);
   }
    }
//int []arr ={1,2,3,4,5,6};
//int max =Integer.MIN_VALUE;
//   for (int e:arr ){
//        if(e>max){
//max=e;
//}
//
//        }
//        System.out.println("the min value is "+max);
//   }
//           }
//        int[] arr = {1, 2, 3, 4, 5, 6};
//        int max=0;
//        for (int e : arr){
//            if (e > max) {
//                max = e;
//
//            }
//
//        }
//        System.out.print("the value of maximum element:"+ max);
//    }
//}