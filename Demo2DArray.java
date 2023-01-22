
 import java.util.Scanner;
    public class Demo2DArray {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter your array elements here : ");

                // here we creating the 2d array objects..
                // rows columns
                // | |
                int arr[][] = new int[2][2]; // its mandatory to declare the rows in 2d array and also columns but, columns
                // that not much.
                for (int row = 0; row < arr.length; row++) {

                    // for each column in every row

                    for (int col = 0; col < arr[row].length; col++) {
                        arr[row][col] = sc.nextInt();
                    }
                }
                for (int row = 0; row < arr.length; row++) {

                    // for each column in every row

                    for (int col = 0; col < arr[row].length; col++) {
                        System.out.print(arr[row][col] + " ");
                    }
                    System.out.println();
                }

            }
        }




