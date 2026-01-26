package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {


        String str="ding dong ding dong ding dong ding dong ding dong ding dong ding dong ding dong";
        // your code goes here
        String[] Ding=str.split(" ");
        StringBuilder st=new StringBuilder();
        for(int i=0;i<Ding.length;i++)
        {
            if(i%2==0)
            {   st.append(Ding[i]);
                st.append(" ");


            }
            else{ char[] Ding2=Ding[i].toCharArray();
                for(int j=Ding2.length-1;j>=0;j--)

                    st.append(Ding2[j]);
                st.append(" ");

            }

        }
        System.out.println(st);
        String[] lala=st.toString().split(" ");

        for(int i=0;i<lala.length;i++)
        {
            if(i%2!=0)
            {  System.out.println(lala[i]);


            }


        }
    }
}
