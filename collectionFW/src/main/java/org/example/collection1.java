package org.example;

public class collection1 {


    abstract static class school{

      abstract void systemm();
                       }


    static class department extends school{
       @Override
        void systemm()
       { System.out.println("this is calss of 1");}

        void school()
        { System.out.println("this is calss of school");}



   }

   public static void main(String[] args){

       department dr=new department();
       dr.school();
       dr.systemm();
   }









































}
