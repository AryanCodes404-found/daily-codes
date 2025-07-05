import java.util.Arrays;

public class method {
//    static void change(int a){
static void change2(int []arr ){
     arr[0]=98;
    }

    public static void main(String[] args) {
        int []marks={56,98,65,44,85};
//        int x=45;
        change2(marks);
        System.out.println("the value of change x is "+ marks[0]);
    }

}
