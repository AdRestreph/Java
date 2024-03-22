package Terrestres;

public abstract class SeresVivos {
    public abstract void nacer();
    public void crecer(){
        System.out.println("Creciendo !");
    }
    public void reproducirse(){
        System.out.println("Reproduciendose...");
    }
    public void morir(){
        System.out.println("Momento de la tumba :(");
    }
}
