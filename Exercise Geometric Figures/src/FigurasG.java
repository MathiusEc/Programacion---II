public class FigurasG {
    /** Declaración de Atributos*/
    private float lado;
    private float radio;

    /** Declarcion de Constructores y Destructores*/
    public FigurasG() {

    }

    public FigurasG(float radio) {
        this.radio = radio;
    }

    /** Metodos propios de Java */
    public float getLado() {
        return lado;
    }

    public float getRadio() {
        return radio;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    /** Meotodos propios del Programador */
    public float cuadradoP(float lado) {
        float p;

        p = lado*4;
        System.out.println("Perimetro es igual a: " + p);

        return p;
    }

}
