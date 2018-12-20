package main;

import java.util.Scanner;

public class Prueba {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digita un numero");

        while (scanner.hasNextInt()){
            System.out.println("Escribio un numero");
        }
    }
}
