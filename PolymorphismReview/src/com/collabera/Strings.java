package com.collabera;

public class Strings {

    public static void main(String[] args){

        String s1 = "s1";
        String s2 = "s2";
        String s3 = "s1";
        String s4 = new String ("s1");
        s2 = "s1";


        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        System.out.println("\n" + s1.equals(s4));
        System.out.println(s1 == s4);

        System.out.println(s1 == s2);
    }
}
