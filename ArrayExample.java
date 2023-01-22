import java.util.*;
public class ArrayExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your array size: ");
        int x = sc.nextInt();
        System.out.println("Enter your array element here: ");
        int arr[] = new int[x];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
