public class AppStore {
    /** Declaracion de Atributos */
    private String nombre;
    private String categoria;
    private int tamanoKB;
    private double precioPesos;
    private int licenciasDisponibles;
    private int licenciasVendidas;

    /** Declaración de Constructores & Destructores*/
    public AppStore() {
    }

    public AppStore(String nombre, String categoria, int tamanoKB, double precioPesos, int licenciasDisponibles, int licenciasVendidas) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.tamanoKB = tamanoKB;
        this.precioPesos = precioPesos;
        this.licenciasDisponibles = licenciasDisponibles;
        this.licenciasVendidas = licenciasVendidas;
    }

    /** Métodos propios de Java (Getters & Setters)*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getTamanoKB() {
        return tamanoKB;
    }

    public void setTamanoKB(int tamanoKB) {
        this.tamanoKB = tamanoKB;
    }

    public double getPrecioPesos() {
        return precioPesos;
    }

    public void setPrecioPesos(double precioPesos) {
        this.precioPesos = precioPesos;
    }

    public int getLicenciasDisponibles() {
        return licenciasDisponibles;
    }

    public void setLicenciasDisponibles(int licenciasDisponibles) {
        this.licenciasDisponibles = licenciasDisponibles;
    }

    public int getLicenciasVendidas() {
        return licenciasVendidas;
    }

    public void setLicenciasVendidas(int licenciasVendidas) {
        this.licenciasVendidas = licenciasVendidas;
    }

    /** Métodos propios del Programador */
    // Descuento por volumen de compra
    public double calcularDescuento(int cantidadComprada) {
        // El metodo equalsIgnoreCase compara dos cadenas ignorando mayusculas y minusculas
        // en el caso que sea iguales retorna true, de lo contrario retorna false

        // Se usa this.categoria para referirse a la categoria del objeto actual y no getCategoria()
        // porque es mas directo y claro en este contexto. además permite ejecutar el metodo equalsIgnoreCase
        // directamente sobre el atributo categoria. Usando getCategoria() tambien funcionaria, pero es menos comun
        // en este tipo de metodos internos.

        double descuento = 0.0;
        if (this.categoria.equalsIgnoreCase("rompecabezas") && cantidadComprada >= 25) {
            descuento = 0.20; // 20% de descuento
        } else if (this.categoria.equalsIgnoreCase("deporte") && cantidadComprada >= 20) {
            descuento = 0.15; // 15% de descuento
        } else if (this.categoria.equalsIgnoreCase("acción") && cantidadComprada >= 15) {
            descuento = 0.15; // 15% de descuento
        }else{
            descuento = 0.0; // No hay descuento
        }
        return descuento;
    }

    public int comprarLicencias(int cantidad) {
        if (cantidad <= getLicenciasDisponibles()) {
            setLicenciasDisponibles(getLicenciasVendidas()-cantidad);
            setLicenciasVendidas(getLicenciasVendidas() + cantidad);
            return cantidad;
        } else {
            int compradas = getLicenciasDisponibles();
            setLicenciasVendidas(getLicenciasVendidas() + getLicenciasDisponibles());
            setLicenciasDisponibles(0);
            return compradas;
        }
    }

    public double venderLicencias(int cantidad) {
        if (cantidad <= getLicenciasVendidas()) {
            setLicenciasVendidas(getLicenciasVendidas() - cantidad);
            setLicenciasDisponibles(getLicenciasDisponibles() + cantidad);
        } else {
            int vendidas = getLicenciasVendidas();
            setLicenciasDisponibles(getLicenciasDisponibles() + getLicenciasVendidas());
            setLicenciasVendidas(0);
        }

        // Llamar a calcularDescuento y aplicar al precio
        // Se usa getLicenciasVendidas() para obtener la cantidad vendida
        // igual que getPrecioPesos() para obtener el precio por licencia
        double descuento = calcularDescuento(getLicenciasVendidas());
        double precioTotal = getPrecioPesos() * getLicenciasVendidas();
        double precioFinal = precioTotal * (1 - descuento);
        return precioFinal;
    }

    public String darJuegoMenosVendido(){


        return "";
    }
