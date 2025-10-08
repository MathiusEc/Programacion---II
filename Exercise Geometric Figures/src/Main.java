// Ejercicio 1
/* Necesito calcular el aerea y el primetro de un triangulo, cuadrado, circulo, rombo*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        /** Declaracion de Objetos */
        FigurasG triangulo = new FigurasG();
        FigurasG cuadrado = new FigurasG();
        FigurasG rombo = new FigurasG();
        FigurasG círculo = new FigurasG();
        Scanner sc = new Scanner(System.in);


        /** Lectura de Datos */

        System.out.println("Ingrese la figura que desea calcular el área y el preimetro");
        System.out.println("1. Cuadrado");
        System.out.println("2. Triangulo");
        System.out.println("3. Rombo");
        System.out.println("4. Circulo");
        int opc = Integer.parseInt(sc.nextLine());
        do {
            switch (opc) {
                case 1:
                    System.out.println("Cuadrado");
                    System.out.println("Ingrese el lado");

                    float l = Integer.parseInt(sc.nextLine());
                    cuadrado.cuadradoP(l);

                    break;
                case 2:
                    System.out.println("Triangulo");
                    break;
                case 3:
                    System.out.println("Rombo");
                    break;
                case 4:
                    System.out.println("Circulo");
                    break;

            }
        }while (opc != 4);


    }
}