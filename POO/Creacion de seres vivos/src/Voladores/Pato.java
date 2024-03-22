package Voladores;

import Terrestres.SeresVivos;
import Terrestres.Terrestre;

public class Pato extends SeresVivos implements Terrestre, Volador {
    @Override
    public void nacer() {
        System.out.println("Naciendo de un huevo");
    }

    @Override
    public void caminar() {
        System.out.println("Caminando en 2 patas");
    }

    @Override
    public void comer() {
        System.out.println("Omnivoro: Come todo lo comestible");
    }

    @Override
    public void cansarse() {
        System.out.println("Agoto todas sus energias...");
    }

    @Override
    public void dormir() {
        System.out.println("Durmiendo...ZzZ");
    }

    @Override
    public void volar() {
        System.out.println("Volando con sus alas");
    }

    @Override
    public void planear() {
        System.out.println("Planeando con sus alas");
    }

    @Override
    public void caerEnPicada() {
        System.out.println("Cayendo con sus alas");
    }
}
