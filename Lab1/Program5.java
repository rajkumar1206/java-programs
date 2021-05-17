package Lab1;

import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        int m, n;

        System.out.print("Enter the value of number of rows and columns respectively: ");
        Scanner scn = new Scanner(System.in);
        m = scn.nextInt();
        n = scn.nextInt();

        int arr[][] = new int[m][n];
        int arrTrans[][] = new int[n][m];

        System.out.println("Enter the Elements of the array");
        for (int i=0;i<m;i++) {
            for (int j=0;j<n;j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        System.out.println("Elements of the array are");
        for (int i=0;i<m;i++) {
            for (int j=0;j<n;j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        for (int i=0;i<m;i++) {
            for (int j=0;j<n;j++) {
                arrTrans[j][i] = arr[i][j];
            }
        }

        System.out.println("Elements of the Transposed array are");
        for (int i=0;i<n;i++) {
            for (int j=0;j<m;j++) {
                System.out.print(arrTrans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
