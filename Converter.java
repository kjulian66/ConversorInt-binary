package com.mycompany.converter;

import java.util.*;

public class Converter {

    public static String convert (int number) {
        String binary = Integer.toBinaryString(number);
        return binary;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Por favor ingrese un numero para pasar a binario");
        int number = sc.nextInt();
        String binary = convert(number);
        System.out.println("El numero en binario es: ");
        System.out.println(binary);
    }
}
