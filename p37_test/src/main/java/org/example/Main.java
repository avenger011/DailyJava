package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
String str="Software";      // software==>awtfostre  only first 6 letters
        char[] str2=str.toCharArray();
        StringBuilder str3=new StringBuilder();
        for (int i=5;i>=0;i--)
        {
            str3.append(str2[i]);

        }
        for (int i=6;i<str2.length;i++)
        {str3.append(str2[i]);}
System.out.println(str3);
    }
}
