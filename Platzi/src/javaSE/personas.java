package javaSE;

import java.util.ArrayList;

public class personas {

    public static void main(String[] args) {

        ArrayList<persona> perro = new ArrayList();
        perro.add(new persona("Yorman","Meneses"));
        perro.add(new persona("Julian","Meneses"));
        perro.add(new persona("Emmanuel","Meneses"));
        perro.add(new persona("Sirley","Meneses"));
        perro.add(new persona("Enid","Meneses"));

        String per = perro.get(4).getNombre();
        
        System.out.println(per);
        
//        Arrays
//        int[] arreglo;
//        Double[] arreglo2;
//        
//        arreglo = new int[2];
//        arreglo2 = new Double[2];
//        
//        
//        int[][] matriz = new int[2][3];
//        int[][][] matriz3d = new int[3][3][2];
//        
//        char[][] days = {{'M','T','W'},{'M','T','W'}};
//        
//        char[] names = new char[3];
//        names[0] = 'Y';
//        names[1] = 'O';
//        names[2] = 'R';
//        
//        
//        int e = 1;
//         while (e <= 5) {
//             System.out.println("e es igual a uno");
//             e++;
//        }
    }

}
