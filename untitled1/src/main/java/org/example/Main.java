package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//to finfd repeated char
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

            String str1="silent";
            String str2="tsilen";
         char[] str11= str1.toCharArray();
       char[] str22=str2.toCharArray();
       Arrays.sort(str11);
       Arrays.sort(str22);
            if(Arrays.equals(str11,str22))
            {System.out.print("yes");}
}}
