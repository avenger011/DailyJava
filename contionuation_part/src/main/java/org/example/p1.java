package org.example;

import java.security.PublicKey;

// use of enumarator
public class p1 {

enum color{
    red("kempu"),
    green("pachhe"),
    black("kappu");

    String Kcolor;

    public String getKcolor() {
        return Kcolor;
    }

    color(String Kcolor){
        this.Kcolor=Kcolor;
    }
    public static void main(String args[])
    {
        System.out.println(color.red.getKcolor());
        if(color.black.getKcolor().equalsIgnoreCase("kappu"))
        {System.out.println("true");}
    }

}
}


