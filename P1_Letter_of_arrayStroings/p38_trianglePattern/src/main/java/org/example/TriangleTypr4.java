package org.example;
//         ********
 //         ******
 //           ****
 //            ***
 //             **
 //
 //
public class TriangleTypr4 {
    public static void main(String[] args){
        int n=8;
        for(int i=0;i<n;i++) {
            for (int j=0;j<2*i-1;j++)System.out.print(" ");
            for (int k=n;k>2*i-1;k--)System.out.print("*");
            System.out.println();
        }
    }
}
