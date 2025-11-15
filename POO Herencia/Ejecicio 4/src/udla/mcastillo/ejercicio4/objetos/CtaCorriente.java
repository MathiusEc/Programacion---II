package udla.mcastillo.ejercicio4.objetos;

public class CtaCorriente  extends Cuenta{
    /** Atributos de CtaCorriente*/
    private double lineaCredito;

    /** Constructores & Destructores */
    public CtaCorriente(int numeroCuenta, double saldo, Inversion tipoInversion, double lineaCredito) {
        super(numeroCuenta, saldo, tipoInversion);
        this.lineaCredito = lineaCredito;
    }

    public CtaCorriente(int numeroCuenta, double saldo, Inversion tipoInversion) {
        super(numeroCuenta, saldo, tipoInversion);
    }

    public CtaCorriente() {
    }

    /** Setters & Getters*/
    public double getLineaCredito() {
        return lineaCredito;
    }

    public void setLineaCredito(double lineaCredito) {
        this.lineaCredito = lineaCredito;
    }

    /** Métodos del Programador */
}
