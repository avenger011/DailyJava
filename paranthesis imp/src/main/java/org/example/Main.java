package org.example;

import java.util.Stack;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String res;
        String inp = "{({[]()})}";
        char[] inp2 = inp.toCharArray();
        //int res=inp2.length;
        Stack<Character> st=new Stack<>();
        for(int i=0;i<inp2.length;i++) {
            if (inp2[i] == '[' || inp2[i] == '{' || inp2[i] == '(') {
                st.push(inp2[i]);
            } else if (inp2[i] == '}') {
                if (st.getLast() != '{') {
                    System.out.println("error in bracket");
                } else {
                    st.pop();
                }
            } else if (inp2[i] == ']') {
                if (st.getLast() != '[') {
                    System.out.println("error in bracket");
                } else {
                    st.pop();
                }
            } else if (inp2[i] == ')') {
                if (st.getLast() != '(') {
                    System.out.println("error in bracket");
                } else {
                    st.pop();
                }
            }


        }

        if(st.size()==0)
        {System.out.println("the brackets are proper");}
        else{System.out.println("error in bracket count extra maybe");}
    }
}
