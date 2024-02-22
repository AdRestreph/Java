package PrimeraGeneracion;

public interface Murcielago extends Mamifero {
    void volar(); // -> METODOS ABSTRACTOS
    void comerFrutas();
    void dormirDeCabeza();

    default void hacerChichi(){//-> METODO OPCIONAL
        System.out.println("Que descansos!..");
    }
    static void hacerGuano(){//METODO ESTATICO
        System.out.println("Tomese un cafesito");
    }
    }

