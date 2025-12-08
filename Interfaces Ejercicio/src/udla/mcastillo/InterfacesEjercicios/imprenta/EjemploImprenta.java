package udla.mcastillo.InterfacesEjercicios.imprenta;

import udla.mcastillo.InterfacesEjercicios.imprenta.modelo.*; // * para importar todo el contenido

public class EjemploImprenta {
    public static void main(String[] args) {
        /** Declaracion de Objetos*/
        Curriculum cv = new Curriculum("JJ", "Ing. de Software", "Resumen laboral");
        cv.addExperience("Java");
        cv.addExperience("PSeint");
        cv.addExperience("Oracle DBA");
        cv.addExperience("Spring Framework");
        cv.addExperience("Full stack developer");
        cv.addExperience("Angular");

        Informe informe = new Informe("JJ", "SC", "Estudio de Hoja de Vida");

        /** Metodo que invoca al metodo abstracto*/
        imprimir(cv);
        imprimir(informe);
    }

    public static void imprimir(Hoja imprimible){
        System.out.println(imprimible.imprimir());
        // Solo se le llama una vez
        // Transversal a todas las clases
        // es decir, que se aplica el Polimorfismo
    }

}