public class Main {
    public static void main(String[] args) {
        // Creacion de objetos
        Automovil auto1 = new Automovil();
        Automovil auto2 = new Automovil(3.2, "i320", "BMW");


        // Llenar valores de forma simple
        auto1.cilindraje = 3.2;
        auto1.marca = "BMW";
        auto1.modelo = "i320";
        auto1.color = "negro";

        // llenar mediante metodos
        auto2.detalle();


        //Desplegar el valor de los objetos
        System.out.println("auto1.marca : " + auto1.marca);
        System.out.println("auto1.modelo : " + auto1.modelo);
        System.out.println("auto1.color : " + auto1.color);
        System.out.println("auto1.cilindraje : " + auto1.cilindraje);
        System.out.println("===================================================");
        System.out.printf("\n");

        // Ejercios clase
        // Crear los objtos
        Motos moto1 = new Motos();
        Motos moto2 = new Motos();

        // Llenar valores
        moto1.precio = 1500;
        moto1.marca = "kawasaki";
        moto1.modelo = "650R";
        moto1.hp = 700;

        moto2.precio = 2000;
        moto2.marca = "KTM";
        moto2.modelo = "Duke";
        moto2.hp = 950;

        // llamar a través de los metodos
        System.out.printf("Moto 1 \n");
        moto1.Detalles();

        System.out.printf("Moto 2 \n");
        moto2.Detalles();

        // Desplegar valores
        System.out.printf("Moto 1 \n");
        System.out.println("marca: " + moto1.marca);
        System.out.println("modelo: " + moto1.modelo);
        System.out.println("precio: " + moto1.precio);
        System.out.println("hp: " + moto1.hp);
        System.out.println("===================================================");
        System.out.printf("\n");

        System.out.printf("Moto 2\n");
        System.out.println("marca: " + moto2.marca);
        System.out.println("modelo: " + moto2.modelo);
        System.out.println("precio: " + moto2.precio);
        System.out.println("hp: " + moto2.hp);
        System.out.println("===================================================");
        System.out.printf("\n");




    }
}
