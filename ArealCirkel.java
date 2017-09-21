package com.company;
import java.util.Scanner;

public class ArealCirkel {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number for radius ");

        //Variabler
        double radius=input.nextDouble();
        double areal;
        areal=radius*radius*3.14;

        System.out.print("Cirklens areal = "+areal);
        //System.out.print
    }
}
