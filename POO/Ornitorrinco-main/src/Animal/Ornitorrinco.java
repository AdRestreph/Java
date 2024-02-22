package Animal;

import Clasificacion.Anfibio;
import Clasificacion.Mamifero;
import Clasificacion.Oviparo;
import Clasificacion.Venenoso;

public class Ornitorrinco extends Mamifero implements Oviparo, Venenoso, Anfibio {
    private int velocidadDeNado;

    public Ornitorrinco(String nombreCientifico, int edad, int velocidadDeNado) {
        super(nombreCientifico, edad);
    }

    public void rareza(){
        System.out.println("Siendo un animal raro");
    }

    @Override
    public void ponerHuevo() {
        System.out.println("Poner huevo");
    }

    @Override
    public void respirarBajoElAgua() {
        System.out.println("Respirando bajo el agua!...");
    }

    @Override
    public void envenenar() {
        System.out.println("Envenenando depredador");
    }


}
