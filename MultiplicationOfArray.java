import java.util.Scanner;

public class MultiplicationOfArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // first enter the array which you want to multipicate.
        int a[][]= new int[2][2];
        int b[][]= new int[2][2];
        // now we take another array for storing the resultant array.
        int result[][]=new int[2][2];
        System.out.println("Enter the 1 matrix element here: ");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                a[i][j]= sc.nextInt();
            }
        }
        // take input for second matrix
        System.out.println("Enter the 2 matrix element here : ");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                b[i][j]= sc.nextInt();
            }
        }
        // now we just multiply the two array
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                result[i][j]=0;
                for(int k=0;k<2;k++){

                    result[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        //Now printing the result of multiplication of matrix...
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }

    }

}
/*suppose,
    a[1][2]   b[4][3]
     [3][4]    [2][1]
logic for  multiplication of matrix is
first row (0) first column(0)
 first row(0) second column(1).
K is for to multiply the inner element of row ..
a[i][k] * b[k][j]
a[0][0] * b[0][0];

after first iteration k will be k++ means k=1;
a[0][0] * b[0][0]
now multiply , 1*4= 4;
then k++;
a[0][1] * b[1][0]
now multiply, 2*2=4;
now adding both result, 4+4= 8;



*/