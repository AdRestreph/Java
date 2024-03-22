package Terrestres;

import Voladores.Volador;

public class Perro extends SeresVivos implements Terrestre{
    @Override
    public void nacer() {
        System.out.println("Naciendo de un parto");
    }

    @Override
    public void caminar() {
        System.out.println("Caminando en 4 patas");
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

}
