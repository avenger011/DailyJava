package org.example;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

      String str="hellow sai 123 asr";
      int countofAlpa=0;
      int countofNum;
      char[] str2=str.toCharArray();
      for(char c:str2){
          if(Character.isAlphabetic(c)){countofAlpa=countofAlpa+1;}
      }System.out.println("count of alphabet id "+countofAlpa);

        List<String> sts=new ArrayList<>();
        sts.add("stone");
        sts.add("sai");
        sts.addFirst("ganesh");
        sts.addLast("ssss");
        sts.remove(1);






     }




    }

