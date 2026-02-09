package org.example;

import java.util.ArrayList;
import java.util.List;

public class p3_ {
    String name;
    String link;
     p3_(String name, String link) {
         this.name = name;
         this.link = link;

     }
    @Override
    public String toString() {
        return "Name: " + name + ", Link: " + link;
    }

    public static void main(String[] args) {
        p3_ l1=new p3_("google","www.googlr.com");
        //l1.LinkDetails("google","www.google.com");
        p3_ l2=new p3_("yahoo","www.yahoo.com");
        p3_ l3=new p3_("mozilla","www.mozilla.com");

        List<p3_> s1=new ArrayList<>();
        s1.add(l1);
        s1.add(l2);
        s1.add(l3);
        System.out.println(s1);
    }
}
