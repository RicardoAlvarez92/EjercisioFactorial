package com.generation;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("ingresa un numero");
        int num = sc.nextInt();
        int fac = 1;


        while ( num!=0) {
            fac=fac*num;
            num--;
        }
        System.out.println("El Factorial es: "  + fac);
    }
}
