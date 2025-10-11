import javax.swing.*;

public class FigurasG {
    /** Declaración de Atributos*/
    private float lado1;
    private float lado2;
    private float lado3;
    private float radio;
    private float base;
    private float altura;
    private float D;
    private float d;

    /** Declarcion de Constructores y Destructores*/
    public float getLado1() {
        return lado1;
    }

    public float getLado2() {
        return lado2;
    }

    public float getLado3() {
        return lado3;
    }

    public float getRadio() {
        return radio;
    }

    public float getBase() {
        return base;
    }

    public float getAltura() {
        return altura;
    }

    public float getD() {
        return D;
    }

    public void setLado1(float lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(float lado2) {
        this.lado2 = lado2;
    }

    public void setLado3(float lado3) {
        this.lado3 = lado3;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setD(float d) {
        D = d;
    }

    /** Meotodos propios del Programador */
    public void cuadradoP(float lado1) {
        float p;
        p = lado1*4;
        JOptionPane.showMessageDialog(null, "El perimetro del cuadrado es: " + p);
    }
    public void cuadradoA(float lado1) {
        float a;
        a = lado1*lado1;
        JOptionPane.showMessageDialog(null, "El área del cuadrado es: " + a);
    }

    public void trianguloP(float lado1, float lado2, float lado3) {
        float p;
        p = lado1 + lado2 + lado3;
        JOptionPane.showMessageDialog(null, "El perimetro del triangulo es: " + p);
    }
    public void trianguloA(float base, float altura) {
        float a;
        a = (base*altura)/2;
        JOptionPane.showMessageDialog(null, "El área del triangulo es: " + a);
    }

    public void romboP(float lado1) {
        float p;
        p = lado1*4;
        JOptionPane.showMessageDialog(null, "El perimetro del rombo es: " + p);
    }
    public void romboA(float D, float d) {
        float a;
        a = (D*d)/2;
        JOptionPane.showMessageDialog(null, "El área del rombo es: " + a);
    }

    public void circuloP(float radio) {
        float p;
        p = (float) (2*Math.PI*radio);
        JOptionPane.showMessageDialog(null, "El perimetro del circulo es: " + p);
    }
    public void circuloA(float radio) {
        float a;
        a = (float) (Math.PI*(radio*radio));
        // Math.PI es una constante que representa el valor de pi
        // pertenece al paquete java.lang.Math
        JOptionPane.showMessageDialog(null, "El área del circulo es: " + a);
    }

    // Validaciones
    public static boolean validarTriangulo(float l1, float l2, float l3) {
        // Verificar desigualdad triangular
        if (l1 + l2 > l3 && l1 + l3 > l2 && l2 + l3 > l1) {
            return true;
        } else {
            System.out.println("Error: Los lados no forman un triángulo válido");
            return false;
        }
    }
    public static boolean validarRombo(float diagonalMayor, float diagonalMenor) {
        if (diagonalMayor > diagonalMenor) {
            return true;
        } else {
            System.out.println("Error: La diagonal mayor debe ser mayor que la diagonal menor");
            return false;
        }
    }


}
