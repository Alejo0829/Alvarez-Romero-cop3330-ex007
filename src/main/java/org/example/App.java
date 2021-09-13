package org.example;
import java.util.Scanner;
/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Rafael Alvarez-Romero
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.print( "What is the length of the room in feet? ");
        int length = sc.nextInt();
        System.out.print( " What is the width of the room in feet? ");
        int width = sc.nextInt();
        int area = length * width;
        final double squaremeterconversion = area * 0.09290394;

        System.out.println(" You entered dimensions of " + length + " feet by " + width + " feet.");
        System.out.println(" The area is ");
        System.out.println( area + " square feet");
        System.out.println(squaremeterconversion + " square meters");
    }
}
