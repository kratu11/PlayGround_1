package com.ultralesson.Javapg2;

import java.util.Scanner;

public class discount {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        int unitCost = 100;
        int unit = sc.nextInt();
        int total = unit*unitCost;

        if( total > 1000) System.out.println("Cost:" + .9*total );
        else System.out.println(total);
    }
}
