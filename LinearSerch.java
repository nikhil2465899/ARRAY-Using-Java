import java.lang.reflect.Array;
import java.util.*;
public class LinearSerch {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int s= sc.nextInt();
        int arr[]= new int[s];
        System.out.println("Enter your array element here: ");
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();




        }

    }

