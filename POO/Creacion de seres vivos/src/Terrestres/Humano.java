package Terrestres;

import Voladores.Volador;

public class Humano extends SeresVivos implements Terrestre, Volador {

    @Override
    public void nacer() {
        System.out.println("Naciendo de un parto");
    }

    @Override
    public void caminar() {
        System.out.println("Caminando en 2 piernas");
    }

    @Override
    public void comer() {
        System.out.println("Omnivoro: Come todo lo comestible");
    }

    @Override
    public void cansarse() {
        System.out.println("Agoto todas sus energias");
    }

    @Override
    public void dormir() {
        System.out.println("Descansando...ZzZ");
    }

    @Override
    public void volar() {
        System.out.println("Usando avion");
    }

    @Override
    public void planear() {
        System.out.println("Planeando en el avion");
    }

    @Override
    public void caerEnPicada() {
        System.out.println("Tirandose en picada en el avion");
    }

   /* public void aprenderAviacion() {
        volar();
        planear();
        caerEnPicada();
    }*/
}
