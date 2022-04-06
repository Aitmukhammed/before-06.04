package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Boolean {
    public static void main(String[] args)
            throws IOException {
        Scanner in = new Scanner(System.in);
        // Boolean 1
//        System.out.println("A: ");
//        int a = in.nextInt();
//
//        if (a>0){
//            System.out.println("true");
//        }else{
//            System.out.println("false");
//        }

        // Boolean 2
//        System.out.println("B: ");
//        int b = in.nextInt();
//
//        if (b>0){
//            System.out.println("false");
//        }else{
//            System.out.println("true");
//        }


        // Boolean 3
//        System.out.println("C: ");
//        int c = in.nextInt();
//
//        if (c>0){
//            System.out.println("false");
//        }else{
//            System.out.println("true");
//        }

        // Boolean 4
//        System.out.print("B: ");
//        int b = in.nextInt();
//        System.out.print("C: ");
//        int c = in.nextInt();
//
//        if (b == c){
//            System.out.println("true");
//        }else{
//            System.out.println("false");
//        }

        // Boolean 5
//        System.out.print("B: ");
//        int b = in.nextInt();
//        System.out.print("C: ");
//        int c = in.nextInt();
//
//        if (b >= 0){
//            System.out.println("true");
//        }else if(c<-2){
//            System.out.println("false");
//        }

//        // Boolean 6
//        System.out.print("A: ");
//        int a = in.nextInt();
//        System.out.print("B: ");
//        int b = in.nextInt();
//        System.out.print("C: ");
//        int c = in.nextInt();
//
//        if (a < b & a < c){
//            System.out.println("true");
//        } else {
//            System.out.println("False");
//        }


        // Boolean 7
//        System.out.print("A: ");
//        int a = in.nextInt();
//        System.out.print("B: ");
//        int b = in.nextInt();
//        System.out.print("C: ");
//        int c = in.nextInt();
//
//        if (a > b & c < b){
//            System.out.println("true");
//        } else {
//            System.out.println("False");
//        }


        // Boolean 10
//        System.out.print("A: ");
//        int a = in.nextInt();
//        System.out.print("B: ");
//        int b = in.nextInt();
//
//        if ((a | b)%2==0){
//            System.out.println("false");
//        } else {
//            System.out.println("true");
//        }

        // Boolean 11
//        System.out.print("A: ");
//        int a = in.nextInt();
//        System.out.print("B: ");
//        int b = in.nextInt();
//
//        if (a==b){
//            System.out.println("true");
//        } else {
//            System.out.println("false");
//        }


        // Boolean 12
        System.out.print("A: ");
        int a = in.nextInt();
        System.out.print("B: ");
        int b = in.nextInt();
        System.out.print("C: ");
        int c = in.nextInt();

        if ((a&b&c) == -1){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
