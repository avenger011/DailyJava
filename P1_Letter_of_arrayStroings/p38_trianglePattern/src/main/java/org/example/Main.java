package org.example;

//            *
//           **
 //         ****
 //
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        int n=5;
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n-i;j++)System.out.print(" ");
        for(int k=0;k<2*i-1;k++)System.out.print("*");

        System.out.println();


    }
    }
}
