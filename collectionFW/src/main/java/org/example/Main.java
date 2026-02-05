package org.example;
import java.util.*;

import static java.util.Collections.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        String sr="qwerthjk fqwenxjiopanzdmjdsdfvsfwetfqasdxaio";
        char[] sr2=sr.toCharArray();
        Map<Character,Integer> sr3=new HashMap<>();
        for(char c:sr2)
        { sr3.put(c,sr3.getOrDefault(c,0)+1);
        } System.out.println(sr3);
        List<Integer> sr5=new ArrayList<>();
        for(Map.Entry<Character,Integer> e:sr3.entrySet())
        {
            sr5.add(e.getValue());}
        Collections.sort(sr5);
      System.out.println(sr5);
      //Collections.sort(sr3);  collection .sort  not used for hashmap
      Set<Integer> sr9=new HashSet<>(sr5);
      ///Collections.sort(sr9);  collection .sort only used on idexed item like array list or linled list

    }
}
