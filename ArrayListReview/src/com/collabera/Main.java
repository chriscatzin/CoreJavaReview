package com.collabera;

/*
* Christopher Catzin
 */
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // size of ArrayList
        int n = 5;

        //declaring ArrayList with initial size n
        ArrayList<Integer> arrli = new ArrayList<Integer>(n);

        // Appending the new element at the end of the list
        for (int i=1; i<=n; i++)
            arrli.add(i);

        // Printing elements
        System.out.println(arrli);

     

    }
}
