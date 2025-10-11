// Ejercicio 1
/* Necesito calcular el aerea y el primetro de un triangulo, cuadrado, circulo, rombo
   no se validan las entradas de caracteres especiales*/


import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /** Declaracion de Objetos */
        FigurasG triangulo = new FigurasG();
        FigurasG cuadrado = new FigurasG();
        FigurasG rombo = new FigurasG();
        FigurasG círculo = new FigurasG();
        Scanner sc = new Scanner(System.in);


        /** Lectura de Datos */
        int opc;
        boolean val;
        do {
            System.out.println("1. Cuadrado");
            System.out.println("2. Triangulo");
            System.out.println("3. Rombo");
            System.out.println("4. Circulo");
            System.out.println("5. Salir");
            opc = Integer.parseInt(sc.nextLine());
            switch (opc) {
                case 1:
                    float l;
                    do {
                        System.out.println("============Cuadrado============");
                        System.out.println("Ingrese el lado: ");
                        l = Float.parseFloat(sc.nextLine());
                        if (l <= 0) {
                            System.out.println("El lado no puede ser negativo o cero");
                        } else {
                            cuadrado.cuadradoA(l);
                            cuadrado.cuadradoP(l);
                        }
                    } while (l <= 0);
                    break;

                case 2:
                    float b, h, l1, l2, l3;
                    do {
                        System.out.println("============Triangulo============");
                        System.out.println("Ingrese la base (Lado 1): ");
                        b = Float.parseFloat(sc.nextLine());
                        l1 = b; // Asigno el valor de la base a l1 para usarlo en el perimetro

                        System.out.println("Ingrese la altura: ");
                        h = Float.parseFloat(sc.nextLine());

                        System.out.println("Ingrese el lado 2: ");
                        l2 = Float.parseFloat(sc.nextLine());

                        System.out.println("Ingrese el lado 3: ");
                        l3 = Float.parseFloat(sc.nextLine());

                        val = FigurasG.validarTriangulo(l1, l2, l3);
                        if (val == false) {
                            l1 = 0; l2 = 0; l3 = 0; // Reinicio los valores para que el ciclo se repita
                        }else {
                            if (b <= 0 || h <= 0 || l1 <= 0 || l2 <= 0 || l3 <= 0) {
                                System.out.println("Los valores no pueden ser negativos o cero");
                            } else {
                                triangulo.trianguloA(b, h);
                                triangulo.trianguloP(l1, l2, l3);
                            }
                        }
                    } while (b <= 0 || h <= 0 || l1 <= 0 || l2 <= 0 || l3 <= 0);
                    break;

                case 3:
                    float D, d, lado = 0;
                    do {
                        System.out.println("============Rombo============");
                        System.out.println("Ingrese la diagonal mayor: ");
                        D = Float.parseFloat(sc.nextLine());

                        System.out.println("Ingrese la diagonal menor: ");
                        d = Float.parseFloat(sc.nextLine());

                        val = FigurasG.validarRombo(D, d);
                        if (val == false) {
                            D = 0; d = 0; // Reinicio los valores para que el ciclo se repita
                        }else{
                            System.out.println("Ingrese el lado: ");
                            lado = Float.parseFloat(sc.nextLine());

                            if (D <= 0 || d <= 0 || lado <= 0) {
                                System.out.println("Los valores no pueden ser negativos o cero");
                            } else {
                                rombo.romboA(D, d);
                                rombo.romboP(lado);
                            }
                        }
                    } while (D <= 0 || d <= 0 || lado <= 0);
                    break;
                case 4:
                    float r;
                    do {
                        System.out.println("============Círculo============");
                        System.out.println("Ingrese el radio: ");
                        r = Float.parseFloat(sc.nextLine());

                        if (r <= 0) {
                            System.out.println("El radio no puede ser negativo o cero");
                        } else {
                            círculo.circuloA(r);
                            círculo.circuloP(r);
                        }
                    } while (r <= 0);
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Gracias por usar el programa");
                    break;

            }
        } while (opc != 5);
    }
}