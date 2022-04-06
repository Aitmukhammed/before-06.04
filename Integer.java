package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Integer {
    public static void main(String[] args)
        throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.print("A: ");
        int a = in.nextInt();
        int sum = (a / 100) + 1;
        System.out.println(sum);
    }
    }

