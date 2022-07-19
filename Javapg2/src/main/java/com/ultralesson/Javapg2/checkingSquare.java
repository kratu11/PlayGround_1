package com.ultralesson.Javapg2;

import java.util.Scanner;

public class checkingSquare {

    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int breadth = sc.nextInt();

        if ( length == breadth) System.out.println("It is a square");
        else System.out.println("It is not a square");
    }
}
