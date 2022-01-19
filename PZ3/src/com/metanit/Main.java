package com.metanit;
import  java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double x = -2.16;
	    Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = in.nextInt();

        if(num < 100)
            System.out.println("less");
        else
            System.out.println("not less");

        Tasks t = new Tasks();
        System.out.println("Введите число от 2 до 5:");
        int numTask2 = in.nextInt();
        t.computeTask2(numTask2);

        System.out.println("Введите число от 0 до 6:");
        int numTask3 = in.nextInt();
        t.computeTask3(numTask3);

        System.out.println("Введите число от 0 до 100:");
        int numTask4 = in.nextInt();
        t.computeTask4(numTask4);

        t.computeTask5(x);
        x = 3.37;
        t.computeTask5(x);

        x = -1.47;
        t.computeTask6(x);
        x = -4.28;
        t.computeTask6(x);
        x = 5.07;
        t.computeTask6(x);
    }
}
