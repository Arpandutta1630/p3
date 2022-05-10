package com.company;
import java.util.*;
public class p4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of the rectangle: ");
        double recLen = sc.nextInt();
        System.out.println("Enter the breadth of the rectangle: ");
        double recBre = sc.nextInt();
        System.out.println("Enter the radius of the circle: ");
        double rad = sc.nextInt();
        double recArea = recLen * recBre;
        double peri = 2 * (recLen + recBre);
        double pie = 3.14;
        double cirArea = pie * rad * rad;
        double cf = 2 * pie * rad;

        System.out.println("The area of rectangle is : " + recArea + " and perimeter is : " + peri);
        System.out.println("The area of the circle is : " + cirArea + " and circumference is : " + cf);
    }
}
