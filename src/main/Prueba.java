package main;

import java.util.Scanner;

public class Prueba {


    public enum Day{
        SUNDAY("Domingo"),
        MONDAY("Lunes"),
        TUESDAY("Martes");

        private String spanish;
        private Day(String s){
            spanish = s;
        }

        public String getSpanish(){
            return spanish;
        }

    }

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Digita un numero");
//
//        while (scanner.hasNextInt()){
//            System.out.println("Escribio un numero");
//        }


        System.out.println(Day.MONDAY);
        System.out.println(Day.MONDAY.getSpanish());

    }
}
