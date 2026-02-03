package org.example;

public class p2_emumarator {
    public static void main(String[] args){
        enum color{red("#FF0000"),green("#00FF00"),blue("#0000FF");

           String hexcode;

           color(String hexcode)
           {this.hexcode=hexcode;}

           String getHexcode()
           {return this.hexcode;}






        }

        System.out.println("redcolor hex code is "+color.red.getHexcode());
        System.out.println("blue color hex code is "+color.blue.getHexcode());
        System.out.println("green color hex code is "+color.green.getHexcode());






    }
}
