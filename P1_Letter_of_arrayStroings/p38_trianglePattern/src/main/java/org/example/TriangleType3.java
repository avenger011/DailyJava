package org.example;
//
 //            8
 //           88
 //          888
 //         8888
 //        88888
 //
 //
public class TriangleType3 {
    public static void main(String[] args){
        int n=9;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i;j++)System.out.print(" ");
            for(int k=n;k>n-i;k--)System.out.print("*");
            System.out.println();
        }

    }
}
